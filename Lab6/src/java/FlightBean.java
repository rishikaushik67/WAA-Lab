/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author rishi
 */
@ManagedBean
@RequestScoped
public class FlightBean {

    /**
     * Creates a new instance of FlightBean
     */
    public FlightBean() {
        trip="RoundTrip";
    }
    
    private String from;
    private String to;
    private String departureDate;
    private String returnDate;
    private String trip;
    private boolean firstClass;
    private boolean exactTheseDays;
    private boolean noStopOver;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getTrip() {
        return trip;
    }

    public void setTrip(String trip) {
        this.trip = trip;
    }

    public boolean isFirstClass() {
        return firstClass;
    }

    public void setFirstClass(boolean firstClass) {
        this.firstClass = firstClass;
    }

    public boolean isExactTheseDays() {
        return exactTheseDays;
    }

    public void setExactTheseDays(boolean exactTheseDays) {
        this.exactTheseDays = exactTheseDays;
    }

    public boolean isNoStopOver() {
        return noStopOver;
    }

    public void setNoStopOver(boolean noStopOver) {
        this.noStopOver = noStopOver;
    }
    
    public void printOnConsole(){
        System.out.println("From: "+from + "\n To: " + to +"\n Departure date :"+ departureDate +"\n Return Date :"+ returnDate
        +"\n" + trip);
        String firstClass="",exactTheseDays="",noStopOver="";
        if(this.firstClass) firstClass="FirstClass,";
        if(this.exactTheseDays)exactTheseDays="ExactTheseDays,";
        if(this.noStopOver)noStopOver="No Stop over";
        System.out.println("Options : "+firstClass+""+exactTheseDays +""+ noStopOver);
    }
}
