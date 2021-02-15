package com.cii.question;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class QuestionVisitor {
    @JsonIgnore
    public AddressQuestion getAddressQuestion(){
        return null;
    }

    @JsonIgnore
    public SignatureQuestion getSignatureQuestion(){
        return null;
    }
    
    @JsonIgnore
    public AmountQuestion getAmountQuestion(){
        return null;
    }
    
    @JsonIgnore
    public CheckboxQuestion getCheckboxQuestion(){
        return null;
    }
    
    @JsonIgnore
    public DateQuestion getDateQuestion(){
        return null;
    }

    @JsonIgnore
    public DlnQuestion getDlnQuestion(){
        return null;
    }
    
    @JsonIgnore
    public DropdownQuestion getDropdownQuestion(){
        return null;
    }
    
    @JsonIgnore
    public FileUploadQuestion getFileUploadQuestion(){
        return null;
    }
    
    @JsonIgnore
    public MultiselectQuestion getMultiselectQuestion(){
        return null;
    }
    
    @JsonIgnore
    public NameQuestion getNameQuestion(){
        return null;
    }
    
    @JsonIgnore
    public SelectQuestion getSelectQuestion(){
        return null;
    }
    
    @JsonIgnore
    public StaticQuestion getStaticQuestion(){
        return null;
    }
    
    @JsonIgnore
    public TextAreaQuestion getTextAreaQuestion(){
        return null;
    }
    
    @JsonIgnore
    public TextQuestion getTextQuestion(){
        return null;
    }
    
    @JsonIgnore
    public PhoneQuestion getPhoneQuestion(){
        return null;
    }
    @JsonIgnore
    public IndexNumberQuestion getIndexNumberQuestion(){
        return null;
    }

    @JsonIgnore
    public PropertyQuestion getPropertyQuestion(){
        return null;
    }
    
    @JsonIgnore
    public AccountQuestion getAccountQuestion(){
        return null;
    }

    @JsonIgnore
    public PercentQuestion getPercentQuestion(){ return null; }
    
}
