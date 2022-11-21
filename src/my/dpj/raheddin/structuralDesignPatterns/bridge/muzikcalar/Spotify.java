package my.dpj.raheddin.structuralDesignPatterns.bridge.muzikcalar;


import my.dpj.raheddin.structuralDesignPatterns.bridge.Muzik;

public class Spotify implements MuzikCalar {


    @Override
    public String muzikCal(Muzik muzik) {
        System.out.println("Spotify " + muzik + " şarkısını çalıyor. ");

        return muzik.getSes();
    }
}
