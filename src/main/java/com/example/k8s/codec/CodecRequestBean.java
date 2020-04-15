package com.example.k8s.codec;

import com.example.k8s.CodecTemplateDTO;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Bean used to communicate with iep-codec
 */
public class CodecRequestBean {

    @NotBlank(message = "Template cannot be blank")
    private String template;
    @NotBlank(message = "UUID cannot be blank")
    private String uuid;
    @NotNull
    @Valid
    private CodecTemplateDTO codecTemplate;

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public CodecTemplateDTO getCodecTemplate() {
        return codecTemplate;
    }

    public void setCodecTemplate (CodecTemplateDTO codecTemplate) {
        this.codecTemplate = codecTemplate;
    }
}
