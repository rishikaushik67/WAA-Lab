/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.customconverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;

/**
 *
 * @author rishi
 */
public class Main {
    public static void main(String[] args) {
         try {
             SimpleDateFormat sdf1 = new SimpleDateFormat("E, MMM d, yyyy");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date convertedCurrentDate = sdf.parse("2013-09-18");
            String date=sdf1.format(convertedCurrentDate );
            
             System.out.println(date);
            
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }
}
