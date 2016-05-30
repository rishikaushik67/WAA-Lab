/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.controller;

import com.mum.bean.JSFEventBean;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rishi
 */
public class JSFEventController {
    
   public List<String> getAirlines(){
       List<String> airlines = new ArrayList<String>();
        airlines.add("Select");
        airlines.add("KLM");
        airlines.add("North West");
        airlines.add("Uniter Airlines");
       return airlines;
   }
   
   public List<JSFEventBean> getAirlineDeatils(){
        List<JSFEventBean> travelDetails = new ArrayList<JSFEventBean>();
        travelDetails.add(new JSFEventBean("Amsterdam", "Newyork", "12/11/06", "KLM", 790.87));
        travelDetails.add(new JSFEventBean("Amsterdam", "Newyork", "12/11/06", "NorthWest", 795.55));
        travelDetails.add(new JSFEventBean("Amsterdam", "Newyork", "12/11/06", "KLM", 820.00));
        travelDetails.add(new JSFEventBean("Amsterdam", "Newyork", "12/11/06", "United Airlines", 825.50));
        travelDetails.add(new JSFEventBean("Amsterdam", "Newyork", "12/11/06", "NorthWest", 875.00));
        travelDetails.add(new JSFEventBean("Amsterdam", "Newyork", "12/11/06", "KLM", 989.00));
        travelDetails.add(new JSFEventBean("Amsterdam", "Newyork", "12/11/06", "United Airlines", 1050.00));
       return travelDetails;
   }
}
