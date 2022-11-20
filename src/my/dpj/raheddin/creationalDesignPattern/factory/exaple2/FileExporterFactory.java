package my.dpj.raheddin.creationalDesignPattern.factory.exaple2;

public class FileExporterFactory {

    public static FileExporter getInstance(FileType fileType) {
        switch (fileType) {
            case EXCEL:
                return new ExcelExporter();
            case PDF:
                return new PdfExporter();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public enum FileType {
        PDF,
        EXCEL;
    }
}