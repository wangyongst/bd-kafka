package com.myweb.pojo;

import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

public class Price implements Serializable {
    private String price;
    private String quantity;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
