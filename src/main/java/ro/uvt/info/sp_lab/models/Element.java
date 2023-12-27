package ro.uvt.info.sp_lab.models;

import ro.uvt.info.sp_lab.services.Visitor;

public interface Element {
    void print();
    void add(Element element);
    void remove(Element element);
    Element get(int id);
    void accept(Visitor v);
}
