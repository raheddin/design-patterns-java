package my.dpj.raheddin.creationalDesignPattern.builder;

public class Main {
    public static void main(String[] args) {

        Ev test = EvBuilder.startEvBuild().setIl("test").setEsyali(true).build();
        System.out.println(test);

        EvBuilder evBuilder = EvBuilder.startEvBuild().setEsyali(true);
        System.out.println(evBuilder);
    }
}
