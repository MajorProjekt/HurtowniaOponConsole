package dodaj;

import polacz.ZapytanieKlient;

import java.sql.SQLException;

public class DodajKlient {
    public void menuDodajKlient() throws SQLException {
        MenuKlient mk = new MenuKlient();

        ZapytanieKlient zk = new ZapytanieKlient();
        mk.menuDodajKlient();
        zk.zapytanieWykonaj(zk.dodajKlient(mk.getImie(), mk.getNazwisko(), mk.getMiasto(), mk.getKodPocztowy(), mk.getUlica(), mk.getNrDomu(), mk.getNrMieszkania()));
    }
}
