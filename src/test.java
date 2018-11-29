import dodaj.DodajKlient;
import menu.WyswietlKlient;
import update.AktualizujKlient;
import usun.UsunKlient;


import java.sql.SQLException;

public class test {
    public static void main(String args[]) throws SQLException {
        /*DodajKlient dk =new DodajKlient();
        dk.menuDodajKlient();
       */
        WyswietlKlient wk = new WyswietlKlient();
        wk.menuWyswietlKlient();

        /*AktualizujKlient ak = new AktualizujKlient();
        ak.menuAktualizujKlienta();*/

        /*UsunKlient uk = new UsunKlient();
        uk.menuUsunKlient();*/

    }
}
