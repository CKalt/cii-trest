package com.cii.model.config;

import com.cii.form.AccessRestrictions;
import java.util.List;

public class FormConfiguration {
    private List<String> forms;
    private List<AccessRestrictions> accessRestrictions;

    public void setForms(List<String> forms) { this.forms = forms; }
    public List<String> getForms() { return this.forms; }
    public void setAccessRestrictions(List<AccessRestrictions> accessRestrictions) { this.accessRestrictions = accessRestrictions; }
    public  List<AccessRestrictions> getAccessRestrictions() { return this.accessRestrictions; }
}
