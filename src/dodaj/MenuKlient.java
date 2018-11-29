package dodaj;

import java.sql.SQLException;
import java.util.Scanner;

public class MenuKlient {


    private String imie = null,
            nazwisko = null,
            miasto = null,
            kodPocztowy = null,
            ulica = null,
            nrDomu = null,
            nrMieszkania = null;



    Scanner odczyt = new Scanner(System.in);

    public MenuKlient(){}

    public MenuKlient(String imie, String nazwisko, String miasto, String kodPocztowy, String ulica, String nrDomu, String nrMieszkania){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
        this.ulica = ulica;
        this.nrDomu = nrDomu;
        this.nrMieszkania = nrMieszkania;
    }

    private void wyswietlKlient(){

        System.out.println("Dane klienta:");
        System.out.println("1) Imie: " + imie);
        System.out.println("2) Nazwisko: " + nazwisko);
        System.out.println("3) Miasto: " + miasto);
        System.out.println("4) Kod Pocztowy: " + kodPocztowy);
        System.out.println("5) Ulica: " + ulica);
        System.out.println("6) nrDomu: " + nrDomu);
        System.out.println("7) nrMieszkania: " + nrMieszkania);
        System.out.println();
        System.out.println("0) Koniec dodawania.");

    }
    private void zmienImie(){
        System.out.print("Imie: ");
        imie = odczyt.next();
    }
    private void zmienNazwisko(){
        System.out.print("Nazwisko: ");
        nazwisko = odczyt.next();
    }
    private void zmienMiasto(){
        System.out.print("Miasto: ");
        miasto = odczyt.next();
    }
    private void zmienKodPocztowy(){
        System.out.print("Kod Pocztowy: ");
        kodPocztowy = odczyt.next();
    }
    private void zmienUlica(){
        System.out.print("Ulica: ");
        ulica = odczyt.next();
    }
    private void zmienNrDomu(){
        System.out.print("Numer domu: ");
        nrDomu = odczyt.next();
    }
    private void zmienNrMieszkania(){
        System.out.print("Numer mieszkania: ");
        nrMieszkania = odczyt.next();
    }

    public void menuDodajKlient() throws SQLException {
        int pozycja;
        boolean chwiloTrwaj = true;


        while(chwiloTrwaj) {
            wyswietlKlient();
            System.out.print("Ktora pozycje chcesz zmienic?(0-7): ");
            pozycja = odczyt.nextInt();
            switch (pozycja) {
                case 0: chwiloTrwaj = false; break;
                case 1: zmienImie(); break;
                case 2: zmienNazwisko(); break;
                case 3: zmienMiasto(); break;
                case 4: zmienKodPocztowy(); break;
                case 5: zmienUlica(); break;
                case 6: zmienNrDomu(); break;
                case 7: zmienNrMieszkania(); break;
                default: System.out.println("Podaj poprawna wartosc: "); break;

            }



        }


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
