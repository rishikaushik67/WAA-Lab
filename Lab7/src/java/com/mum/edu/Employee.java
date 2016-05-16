/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.edu;

/**
 *
 * @author rishi
 */
public class Employee {
    
    private int id;
    
    private String name;
    
    private String phone;
    
    private String salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Employee() {
    }

    public Employee(int id, String name, String phone, String salary) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }
 }
