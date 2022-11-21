package my.dpj.raheddin.structuralDesignPatterns.bridge.cihaz;

import my.dpj.raheddin.structuralDesignPatterns.bridge.Muzik;
import my.dpj.raheddin.structuralDesignPatterns.bridge.muzikcalar.Fizy;
import my.dpj.raheddin.structuralDesignPatterns.bridge.sescihazi.Kulaklik;

public class BilgisayarKF extends MuzikCalabilenBilgisayar {

    public BilgisayarKF() {
        sesCihazi = new Kulaklik();
        muzikCalar = new Fizy();
    }

    @Override
    public void muzikCal(Muzik muzik) {

        System.out.println("Bilgisayar çalıştı");
        super.muzikCal(muzik);
    }
}
