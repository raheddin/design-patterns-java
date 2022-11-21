package my.dpj.raheddin.structuralDesignPatterns.bridge;


import my.dpj.raheddin.structuralDesignPatterns.bridge.cihaz.BilgisayarKF;
import my.dpj.raheddin.structuralDesignPatterns.bridge.cihaz.Telefon;
import my.dpj.raheddin.structuralDesignPatterns.bridge.muzikcalar.Fizy;
import my.dpj.raheddin.structuralDesignPatterns.bridge.muzikcalar.Spotify;
import my.dpj.raheddin.structuralDesignPatterns.bridge.sescihazi.Kulaklik;

public class App {

    public static void main(String[] args) {

        Muzik muzik = new Muzik("Sezen Aksu - Gülümse", "Gülümse hadi gülümse");

        BilgisayarKF bilgisayarKF = new BilgisayarKF();
        bilgisayarKF.muzikCal(muzik);

        System.out.println("***********************");

        Telefon telefon = new Telefon(new Kulaklik(), new Fizy());
        telefon.muzikCal(muzik);

        System.out.println("***********************");

        Telefon telefon2 = new Telefon(new Kulaklik(), new Spotify());
        telefon2.muzikCal(muzik);

    }
}
