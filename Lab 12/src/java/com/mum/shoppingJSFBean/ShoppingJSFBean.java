/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.shoppingJSFBean;

import com.mum.shoppingBean.ShoppingBean;
import java.util.ArrayList;
import java.util.Arrays;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author rishi
 */
@ManagedBean
@RequestScoped
public class ShoppingJSFBean {

    /**
     * Creates a new instance of ShoppingJSFBean
     */
    public ShoppingJSFBean() {
    }
    
    private String id;
    
    private String description;
    
    private double price;
    
    private int quantity;
    
    private static double totalPrice;

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    private ArrayList<ShoppingBean> initialList =
 new ArrayList<ShoppingBean>(Arrays.asList(

 new ShoppingBean("A32581", "The winner takes it all", 11.95),
 new ShoppingBean("A33278", "Yellow Submarine", 13.95)
 )); 
    
    private static ArrayList<ShoppingBean> orderList = new ArrayList<>();
    
    public void addToCart(ShoppingBean shoppingBean){
        int quantity = shoppingBean.getQuantity()+1;
        double total  = shoppingBean.getPrice()*quantity;
        totalPrice = totalPrice+total;
        shoppingBean.setQuantity(quantity);
        shoppingBean.setTotal(total);
        
        orderList.add(shoppingBean);
    }

    public void removeFromCart(ShoppingBean shoppingBean){
        if(orderList!=null){
            orderList.remove(shoppingBean);
            totalPrice = totalPrice-shoppingBean.getPrice();
        }
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ArrayList<ShoppingBean> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<ShoppingBean> orderList) {
        this.orderList = orderList;
    }

    public ArrayList<ShoppingBean> getInitialList() {
        return initialList;
    }

    public void setInitialList(ArrayList<ShoppingBean> initialList) {
        this.initialList = initialList;
    }
    
    
}
