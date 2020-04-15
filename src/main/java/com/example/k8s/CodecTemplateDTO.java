package com.example.k8s;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Define the list of properties supported/mandatory of the template and the charts included in this template
 */
public class CodecTemplateDTO {

    @NotBlank(message = "The Codec template name is mandatory and cannot be empty")
    private String name;
    @NotBlank
    private String version;
    @Valid
    private List<@Valid CodecPropertyDTO> codecProperties = new ArrayList();
    @Valid
    private List<@Valid ChartDTO> charts = new ArrayList();
    private Map<String, String> params = new HashMap<>();

    public List<CodecPropertyDTO> getCodecProperties() {
        return codecProperties;
    }

    public void setCodecProperties(List<CodecPropertyDTO> codecProperties) {
        this.codecProperties = codecProperties;
    }

    public List<ChartDTO> getCharts() {
        return charts;
    }

    public void setCharts(List<ChartDTO> charts) {
        this.charts = charts;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
