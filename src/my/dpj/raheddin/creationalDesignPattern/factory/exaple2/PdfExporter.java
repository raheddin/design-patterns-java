package my.dpj.raheddin.creationalDesignPattern.factory.exaple2;

class PdfExporter implements FileExporter {
    @Override
    public String export(String content) {
        return "PDF-> " + content;
    }
}