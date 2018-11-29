package polacz;




import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ZapytanieKlient {
    private static final Logger Log = Logger.getLogger(ZapytanieKlient.class.getName());

    public String dodajKlient(String imie, String nazwisko, String miasto, String kodPocztowy, String ulica, String nrDomu, String nrMieszkania){

        String query = String.format("INSERT INTO Klient VALUES(NULL, '%s', '%s', '%s', '%s', '%s', '%s', '%s');", imie, nazwisko, miasto, kodPocztowy, ulica, nrDomu, nrMieszkania);
        return query;

    }

    public String updateKlient(int idKlient, String imie, String nazwisko, String miasto, String kodPocztowy, String ulica, String nrDomu, String nrMieszkania){
        String query = String.format("UPDATE Klient SET imie = '%s', nazwisko = '%s', miasto = '%s', kodpocztowy = '%s', ulica = '%s', nrDomu='%s', nrMieszkania='%s' WHERE IdKlient = %d;", imie, nazwisko, miasto, kodPocztowy, ulica, nrDomu, nrMieszkania, idKlient);
        return query;
    }

    public String usunKlient(int idKlient){
        String query = String.format("Delete from Klient where IdKlient = %d", idKlient);
        return query;
    }

    public void zapytanieWykonaj(String query) throws SQLException {
        Polacz polacz = new Polacz();


        Statement stmt = null;

        try {
            stmt = polacz.getConnection().createStatement();
            stmt.executeUpdate(query);

        }catch (SQLException e){
            e.printStackTrace();
            Log.log(Level.WARNING, "Zapytanie nie zostało wykonane");
        } finally {
            if(stmt != null) {stmt.close(); }
        }

    }


}
