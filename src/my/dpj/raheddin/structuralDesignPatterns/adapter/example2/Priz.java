package my.dpj.raheddin.structuralDesignPatterns.adapter.example2;

public class Priz {

    public void elektrikVer(ElektrikliEvAletleri elektrikliEvAletleri){

        int volt = elektrikliEvAletleri.prizeTakVeCalistir();
        System.out.println("Prizden " + volt + " volt alınıyor");

    }
}