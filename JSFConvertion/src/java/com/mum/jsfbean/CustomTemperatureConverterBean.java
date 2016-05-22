/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.jsfbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author rishi
 */
@ManagedBean
@RequestScoped
public class CustomTemperatureConverterBean {

    /**
     * Creates a new instance of CustomConverterBean
     */
    public CustomTemperatureConverterBean() {
    }
    
    
    private String temparature;

    public String getTemparature() {
        return temparature;
    }

    public void setTemparature(String temparature) {
        this.temparature = temparature;
    }

    @Override
    public String toString() {
        return (this.temparature); //To change body of generated methods, choose Tools | Templates.
    }
 }
