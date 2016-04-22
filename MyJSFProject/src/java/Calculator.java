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
public class Calculator {

    /**
     * Creates a new instance of Calculator
     */
    public Calculator() {
    }
    
    private int firstNumber;
    
    private int secondNumber;
    
    private int result;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
    
    public void add(){
        result=firstNumber+secondNumber;
    }
    
    public void sub(){
        result=firstNumber-secondNumber;
    }
    
    public void multiply(){
        result=firstNumber*secondNumber;
    }
    
    public void divide(){
        result=firstNumber/secondNumber;
    }
 }
