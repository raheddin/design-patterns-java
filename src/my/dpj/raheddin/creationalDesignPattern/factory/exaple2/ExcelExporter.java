package my.dpj.raheddin.creationalDesignPattern.factory.exaple2;

class ExcelExporter implements FileExporter {
    @Override
    public String export(String content) {
        return "EXCEL -> " + content;
    }
}