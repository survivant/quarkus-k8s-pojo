package com.example.k8s.codec;

import com.example.k8s.CodecDTO;

/**
 * Bean used to communicate with iep-codec
 */
public class CodecResponseBean {

    private String uuid;
    private CodecDTO codec;

    public CodecResponseBean() {
    }

    public CodecResponseBean(CodecDTO codec) {
        this.codec = codec;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public CodecDTO getCodec() {
        return codec;
    }

    public void setCodec(CodecDTO codec) {
        this.codec = codec;
    }
}
