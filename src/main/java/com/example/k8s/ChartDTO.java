package com.example.k8s;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Contains information for the chart and properties
 */
public class ChartDTO {

    @NotBlank(message = "The Chart name is mandatory and cannot be empty")
    private String name;
    @NotBlank(message = "The Chart release name is mandatory and cannot be empty")
    private String releaseName;
    private String version;
    private String namespace;
    @Valid
    private List<@Valid ChartPropertyDTO> properties = new ArrayList();
    private Map<String, String> params = new HashMap<>();

    public ChartDTO() {
    }

    public ChartDTO(String name, String releaseName) {
        this.name = name;
        this.releaseName = releaseName;
    }

    public ChartDTO(String name, String releaseName, String version) {
        this.name = name;
        this.releaseName = releaseName;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseName() {
        return releaseName;
    }

    public void setReleaseName(String releaseName) {
        this.releaseName = releaseName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public List<ChartPropertyDTO> getProperties() {
        return properties;
    }

    public void setProperties(List<ChartPropertyDTO> properties) {
        this.properties = properties;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }
}
