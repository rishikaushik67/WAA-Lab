/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.customconverter;

import com.mum.jsfbean.CustomDateConverterBean;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author rishi
 */
@FacesConverter("com.mum.CustomDataConverter")
public class CustomDateConverter implements Converter{

    /**
     * Creates a new instance of CustomConvertor
     */
    public CustomDateConverter() {
    }

    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        CustomDateConverterBean bean=new CustomDateConverterBean();
        try {
            SimpleDateFormat sdf1 = new SimpleDateFormat("E, MMM d, yyyy");
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date convertedCurrentDate = sdf.parse(value);
            String date=sdf1.format(convertedCurrentDate );
            
            bean.setDate(date);
            
        } catch (ParseException ex) {
            Logger.getLogger(CustomDateConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bean;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
       return value.toString();
    }
}
