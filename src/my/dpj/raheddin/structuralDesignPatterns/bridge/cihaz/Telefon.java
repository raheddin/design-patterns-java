package my.dpj.raheddin.structuralDesignPatterns.bridge.cihaz;

import my.dpj.raheddin.structuralDesignPatterns.bridge.Muzik;
import my.dpj.raheddin.structuralDesignPatterns.bridge.muzikcalar.MuzikCalar;
import my.dpj.raheddin.structuralDesignPatterns.bridge.sescihazi.SesCihazi;

public class Telefon extends MuzikCalabilenBilgisayar {

    public Telefon(SesCihazi sesCihazi, MuzikCalar muzikCalar) {
        super(sesCihazi, muzikCalar);
    }

    @Override
    public void muzikCal(Muzik muzik) {
        System.out.println("Telefon müzik çalıyor");

        super.muzikCal(muzik);
    }
}
