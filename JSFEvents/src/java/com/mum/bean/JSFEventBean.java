/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.bean;

/**
 *
 * @author rishi
 */
public class JSFEventBean {
    
    private String startLoaction;
    private String destination;
    private String date;
    private String airlines;
    private Double price;

    public String getStartLoaction() {
        return startLoaction;
    }

    public void setStartLoaction(String startLoaction) {
        this.startLoaction = startLoaction;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAirlines() {
        return airlines;
    }

    public void setAirlines(String airlines) {
        this.airlines = airlines;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public JSFEventBean(String startLoaction, String destination, String date, String airlines, Double price) {
        this.startLoaction = startLoaction;
        this.destination = destination;
        this.date = date;
        this.airlines = airlines;
        this.price = price;
    }
    
    
}
