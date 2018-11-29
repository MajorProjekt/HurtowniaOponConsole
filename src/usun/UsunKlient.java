package usun;

import dbKlasa.Klient;
import pobierz.ArrayKlient;
import polacz.ZapytanieKlient;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsunKlient {
    private int rekord;
    List<Klient> klient = new ArrayList();
    Scanner odczyt = new Scanner(System.in);

    private void pobierzRekord(){
        System.out.print("Podaj Klienta do usuniecia: ");
        rekord = odczyt.nextInt() - 1;

    }

    private int pobierzId(){

        return klient.get(rekord).getIdKlient();
    }



    public void menuUsunKlient() throws SQLException {

        ArrayKlient ak = new ArrayKlient();
        ZapytanieKlient zk = new ZapytanieKlient();
        ak.arrayKlient();
        klient = ak.getKlient();
        pobierzRekord();
        zk.zapytanieWykonaj(zk.usunKlient(pobierzId()));

    }
}
