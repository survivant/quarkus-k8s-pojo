package com.example.k8s;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CodecDTO {

    @NotBlank(message = "The Codec name is mandatory and cannot be empty")
    private String name;
    private String namespace;
    private Map<String, String> params = new HashMap<>();

    @Valid
    private List<ChartDTO> charts = new ArrayList();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ChartDTO> getCharts() {
        return charts;
    }

    public void setCharts(List<ChartDTO> charts) {
        this.charts = charts;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }
}
