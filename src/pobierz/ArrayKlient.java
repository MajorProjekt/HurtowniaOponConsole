package pobierz;

import dbKlasa.Klient;
import polacz.Polacz;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ArrayKlient {



    private List<Klient> klient = new ArrayList();
    private static final Logger Log = Logger.getLogger(ArrayKlient.class.getName());
    public void arrayKlient() throws SQLException {
        Polacz polacz = new Polacz();
        Statement stmt = null;
        String query = "Select * from klient;";



        try {
            stmt = polacz.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {

                int klientID = rs.getInt("IdKlient");
                String imie = rs.getString("Imie");
                String nazwisko = rs.getString("Nazwisko");
                String miasto = rs.getString("Miasto");
                String kodPocztowy = rs.getString("KodPocztowy");
                String ulica = rs.getString("Ulica");
                String nrDomu = rs.getString("NrDomu");
                String nrMieszkania = rs.getString("NrMieszkania");

                klient.add(new Klient(klientID, imie, nazwisko, miasto, kodPocztowy, ulica, nrDomu, nrMieszkania));


            }
        } catch (SQLException e ) {
            e.printStackTrace();
            Log.log(Level.WARNING, "Nie nawiazano polaczenia z baza");

        } finally {
            if (stmt != null) { stmt.close(); }
        }

    }

    public List getKlient() {
        return klient;
    }
}
