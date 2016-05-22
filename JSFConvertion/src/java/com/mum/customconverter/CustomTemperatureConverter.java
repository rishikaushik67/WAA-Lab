/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.customconverter;

import com.mum.jsfbean.CustomTemperatureConverterBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author rishi
 */
@FacesConverter("com.mum.CustomTempConverter")
public class CustomTemperatureConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        String temp="";
        
        if(value.contains("f")){
           temp =value.replace("f", " Fahreinheat");
        }else if(value.contains("c")){
            temp=value.replace("c", "  Celcius");
        }
         CustomTemperatureConverterBean bean=new CustomTemperatureConverterBean();
        bean.setTemparature(temp);
        return bean;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
     
        return value.toString();
    }
    
}
