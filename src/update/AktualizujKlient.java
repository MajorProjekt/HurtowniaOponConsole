package update;

import dbKlasa.Klient;
import dodaj.MenuKlient;
import pobierz.ArrayKlient;
import polacz.ZapytanieKlient;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AktualizujKlient {
    private int rekord;
    List<Klient> klient = new ArrayList();
    Scanner odczyt = new Scanner(System.in);
    private static final Logger Log = Logger.getLogger(AktualizujKlient.class.getName());
    private void pobierzRekord(){
        System.out.print("Podaj Klienta do update: ");
        rekord = odczyt.nextInt() - 1;

    }

    private int pobierzId(){

        return klient.get(rekord).getIdKlient();
    }

    private String pobierzImie(){
        return klient.get(rekord).getImie();
    }

    private String pobierzNazwisko(){
        return klient.get(rekord).getNazwisko();
    }

    private String pobierzMiasto(){
        return klient.get(rekord).getMiasto();
    }

    private String pobierzKodPocztowy(){
        return klient.get(rekord).getKodPocztowy();
    }

    private String pobierzUlica(){
        return klient.get(rekord).getUlica();
    }

    private String pobierzNrDomu(){
        return klient.get(rekord).getNrDomu();
    }

    private String pobierzNrMieszkania(){
        return klient.get(rekord).getNrMieszkania();
    }


    public void menuAktualizujKlienta() throws SQLException {
        ArrayKlient ak = new ArrayKlient();
        ZapytanieKlient zk = new ZapytanieKlient();
        ak.arrayKlient();
        klient = ak.getKlient();
        pobierzRekord();

        MenuKlient mk = new MenuKlient(pobierzImie(), pobierzNazwisko(), pobierzMiasto(), pobierzKodPocztowy(), pobierzUlica(), pobierzNrDomu(), pobierzNrMieszkania());
        mk.menuDodajKlient();

        zk.zapytanieWykonaj(zk.updateKlient(pobierzId(), mk.getImie(), mk.getNazwisko(), mk.getMiasto(), mk.getKodPocztowy(), mk.getUlica(), mk.getNrDomu(), mk.getNrMieszkania()));
        Log.log(Level.INFO, "Klient o id " + pobierzId() + " został zaktualizowany.");

    }
}
