package my.dpj.raheddin.structuralDesignPatterns.adapter.example2;

public class TelefonEEAAdapter implements ElektrikliEvAletleri {

    private Telefon telefon;

    public TelefonEEAAdapter(Telefon telefon) {
        this.telefon = telefon;
    }

    @Override
    public int prizeTakVeCalistir() {
        return telefon.sarjEt();
    }
}