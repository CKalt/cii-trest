package com.cii.model.config;
import com.cii.pdf.FormValue;
import java.util.List;
public class PDFForm {
    private List<FormValue> values;

    public List<FormValue> getValues() {
        return values;
    }
    public void setValues(List<FormValue> values) {
        this.values = values;
    }
}
