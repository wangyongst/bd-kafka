package com.myweb.domain;

import java.io.Serializable;

public class XiuZheng implements Serializable {

    private String xingming;
    private String shoujihaoma;
    private String hanghao;

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }

    public String getShoujihaoma() {
        return shoujihaoma;
    }

    public void setShoujihaoma(String shoujihaoma) {
        this.shoujihaoma = shoujihaoma;
    }

    public String getHanghao() {
        return hanghao;
    }

    public void setHanghao(String hanghao) {
        this.hanghao = hanghao;
    }
}