package my.dpj.raheddin.structuralDesignPatterns.bridge.cihaz;

import my.dpj.raheddin.structuralDesignPatterns.bridge.Muzik;
import my.dpj.raheddin.structuralDesignPatterns.bridge.muzikcalar.MuzikCalar;
import my.dpj.raheddin.structuralDesignPatterns.bridge.sescihazi.SesCihazi;

public abstract class MuzikCalabilenBilgisayar {

    protected SesCihazi sesCihazi;
    protected MuzikCalar muzikCalar;

    public MuzikCalabilenBilgisayar() {
    }

    public MuzikCalabilenBilgisayar(SesCihazi sesCihazi, MuzikCalar muzikCalar) {
        this.sesCihazi = sesCihazi;
        this.muzikCalar = muzikCalar;
    }

    public void muzikCal(Muzik muzik) {

        String ses = muzikCalar.muzikCal(muzik);
        sesCihazi.sesiCal(ses);
    }
}
