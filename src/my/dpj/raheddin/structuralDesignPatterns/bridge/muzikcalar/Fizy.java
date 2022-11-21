package my.dpj.raheddin.structuralDesignPatterns.bridge.muzikcalar;

import my.dpj.raheddin.structuralDesignPatterns.bridge.Muzik;

public class Fizy implements MuzikCalar {

    @Override
    public String muzikCal(Muzik muzik) {

        System.out.println("Fizy " + muzik + " şarkısını çalıyor. ");

        return muzik.getSes();
    }
}
