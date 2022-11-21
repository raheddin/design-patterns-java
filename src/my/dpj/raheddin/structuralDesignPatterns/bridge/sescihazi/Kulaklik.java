package my.dpj.raheddin.structuralDesignPatterns.bridge.sescihazi;

public class Kulaklik implements SesCihazi {

    @Override
    public void sesiCal(String ses) {

        System.out.println("Kulaklık ses çalıyor -> " + ses);
    }
}
