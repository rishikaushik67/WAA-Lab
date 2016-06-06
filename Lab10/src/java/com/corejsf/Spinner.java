/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corejsf;

import java.io.IOException;
import java.util.Map;
import javax.faces.component.FacesComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

/**
 *
 * @author rishi
 * All methods are from professors material 
 */
@FacesComponent("com.corejsf.Spinner")
public class Spinner extends UIInput{
    private String LESS=".less";
    private String MORE=".more";
    

    @Override
    public void encodeBegin(FacesContext context) throws IOException {
        ResponseWriter writer = context.getResponseWriter();
        String clientId = getClientId(context);

        encodeInputField(writer, clientId);
        encodeDecrementButton(writer, clientId);
        encodeIncrementButton(writer, clientId);
    }

    private void encodeInputField(ResponseWriter writer, String clientId) throws IOException {
        writer.startElement("input", this);
        writer.writeAttribute("name", clientId, null);

        Object v = getValue();
        if (v != null) {
            writer.writeAttribute("value", v, "value");
        }

        Object size = getAttributes().get("size");
        if (size != null) {
            writer.writeAttribute("size", size, "size");
        }

        writer.endElement("input");
    }

    private void encodeDecrementButton(ResponseWriter writer, String clientId) throws
            IOException {
        writer.startElement("input", this);
        writer.writeAttribute("type", "submit", null);
        writer.writeAttribute("name", clientId + LESS, null);
        writer.writeAttribute("value", "<", "value");
        writer.endElement("input");
    }
    
     private void encodeIncrementButton(ResponseWriter writer, String clientId) throws
            IOException {
        writer.startElement("input", this);
        writer.writeAttribute("type", "submit", null);
        writer.writeAttribute("name", clientId + MORE, null);
        writer.writeAttribute("value", "<", "value");
        writer.endElement("input");
    }

    @Override
    public void decode(FacesContext context) {
        Map<String, String> requestMap
                = context.getExternalContext().getRequestParameterMap();
        /* get JSF generated component id */
        String clientId = getClientId(context);

        int increment;
        /* detect which button < or > was clicked */
        if (requestMap.containsKey(clientId + MORE)) {
            increment = 1;
        } else if (requestMap.containsKey(clientId + LESS)) {
            increment = -1;
        } else {
            increment = 0;
        }

        try {
            /* get request value for this component */
            int submittedValue = Integer.parseInt((String) requestMap.get(clientId));

            int newValue = getIncrementedValue(submittedValue, increment);
            setSubmittedValue("" + newValue); //make it a String
        } catch (NumberFormatException ex) {
            // let the converter take care of bad input, but we still have
            // to set the submitted value, or the converter won't have
            // any input to deal with
            setSubmittedValue((String) requestMap.get(clientId));
        }
    }

    private int getIncrementedValue(int submittedValue, int increment) {
        Integer minimum = toInteger(getAttributes().get("minimum"));
        Integer maximum = toInteger(getAttributes().get("maximum"));
        int newValue = submittedValue + increment;

        if ((minimum == null || newValue >= minimum.intValue())
                && (maximum == null || newValue <= maximum.intValue())) {
            return newValue;
        } else {
            return submittedValue;
        }
    }

    /* value of minimum or maximum attributes could be set as String literal or by a value
     expression, which might return a Number */
    private static Integer toInteger(Object value) {
        if (value == null) {
            return null;
        }
        if (value instanceof Number) {
            return ((Number) value).intValue();
        }
        if (value instanceof String) {
            return Integer.parseInt((String) value);
        }
        throw new IllegalArgumentException("Cannot convert " + value);
    }

}
