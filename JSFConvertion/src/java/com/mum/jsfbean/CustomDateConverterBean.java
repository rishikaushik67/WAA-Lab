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
public class CustomDateConverterBean {

    /**
     * Creates a new instance of CustomConverterBean
     */
    public CustomDateConverterBean() {
    }
    
    private String date ;
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    

    @Override
    public String toString() {
        return (this.date); //To change body of generated methods, choose Tools | Templates.
    }
 }
