package dbKlasa;

public class Klient {
    private int idKlient;
    private String imie;
    private String nazwisko;
    private String miasto;
    private String kodPocztowy;
    private String ulica;
    private String nrDomu;
    private String nrMieszkania;

    public Klient(int idKlient, String imie, String nazwisko, String miasto, String kodPocztowy, String ulica, String nrDomu, String nrMieszkania){
        this.idKlient = idKlient;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
        this.ulica = ulica;
        this.nrDomu = nrDomu;
        this.nrMieszkania = nrMieszkania;
    }

    public int getIdKlient() {
        return idKlient;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getMiasto() {
        return miasto;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public String getUlica() {
        return ulica;
    }

    public String getNrDomu() {
        return nrDomu;
    }

    public String getNrMieszkania() {
        return nrMieszkania;
    }


}
