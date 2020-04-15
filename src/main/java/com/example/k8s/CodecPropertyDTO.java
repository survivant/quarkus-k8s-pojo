package com.example.k8s;

import javax.validation.constraints.NotBlank;

/**
 * property for the codec template
 */
public class CodecPropertyDTO {

    @NotBlank(message = "The Codec property name is mandatory and cannot be empty")
    private String name;
    private Boolean mandatory = Boolean.FALSE;
    private String value;

    public CodecPropertyDTO() {
    }

    public CodecPropertyDTO(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getMandatory() {
        return mandatory;
    }

    public void setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
