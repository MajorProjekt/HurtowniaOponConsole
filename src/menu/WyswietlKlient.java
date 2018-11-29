package menu;

import dbKlasa.Klient;
import pobierz.ArrayKlient;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class WyswietlKlient {

    List<Klient> klient = new ArrayList();


    public void menuWyswietlKlient() throws SQLException {
        ArrayKlient ak = new ArrayKlient();
        ak.arrayKlient();
        klient = ak.getKlient();

        for (int i = 0; i < klient.size(); i++){
            System.out.println( (i+1) + ") " + klient.get(i).getImie() + " " + klient.get(i).getNazwisko());
        }

    }




}
