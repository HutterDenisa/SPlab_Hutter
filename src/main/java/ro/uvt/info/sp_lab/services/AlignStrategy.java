package ro.uvt.info.sp_lab.services;


import ro.uvt.info.sp_lab.models.Context;
import ro.uvt.info.sp_lab.models.Paragraph;

public interface AlignStrategy {
    public void render(Paragraph paragraph, Context context);
}
