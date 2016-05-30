/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.bean;

import com.mum.controller.JSFEventController;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author rishi
 */
@ManagedBean
@RequestScoped
public class JSFEventManagedBean {

    /**
     * Creates a new instance of JSFEventManagedBean
     */
    
    private List<String> airlines;
    
    public String airLinesName;
    
    private List<JSFEventBean> travelDetails = new ArrayList<JSFEventBean>();
    
    public JSFEventManagedBean() {
       travelDetails = new JSFEventController().getAirlineDeatils();
    }
     
    public List<String> getAirlines() {
        return new JSFEventController().getAirlines();
    }

    public void setAirlines(List<String> airlines) {
        this.airlines = airlines;
    }

    public List<JSFEventBean> getTravelDetails() {
        return travelDetails;
    }

    public String getAirLinesName() {
        return airLinesName;
    }

    public void setAirLinesName(String airLinesName) {
        this.airLinesName = airLinesName;
    }

    public void setTravelDetails(List<JSFEventBean> travelDetails) {
        
    }
    
     public List<JSFEventBean> getAirlineDetails(){
       
       return travelDetails;
    }
     
      public void airlineDetails(ValueChangeEvent e) {
	        if(e.getNewValue().equals("All"))
	        {
	            
	            
	        }
	        else
	        {
	            List<JSFEventBean> newTravelDetails = new ArrayList<>();
	            for(JSFEventBean newTravelDetail : travelDetails){
	                if(newTravelDetail.getAirlines().equals(e.getNewValue()))
	                {
	                   newTravelDetails.add(newTravelDetail);
	                }
	            }
                    travelDetails=newTravelDetails;
	        }
	        

	    }
}
