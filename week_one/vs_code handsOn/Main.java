public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        WordDocumentFactory wdf = new WordDocumentFactory();
        Document wordDoc = wdf.createDocument();
        wordDoc.open();

        PDFDocumentFactory pdfFactory = new PDFDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        ExcelDocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}
