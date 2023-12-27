package ro.uvt.info.sp_lab.services;

import ro.uvt.info.sp_lab.models.*;

public interface Visitor{
    void visitBook(Book book);
    void visitSection(Section section);
    void visitTableOfContents(TableOfContents tableOfContents);
    void visitParagraph(Paragraph paragraph);
    void visitImageProxy(ImageProxy imageProxy);
    void visitImage(Image image);
    void visitTable(Table table);
}
