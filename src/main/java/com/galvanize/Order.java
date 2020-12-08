package com.galvanize;

import java.time.LocalDateTime;

public class Order {
    private String orderNumber;
    private String name;
    private LocalDateTime createdDate;

    //your code goes here, do not change any existing code
    //declare a constructor that sets the order number and name.
    //When an order is created, it should also save the creation date (hint: use LocalDateTime.now()).


    public Order(String orderNumber, String name) {
        this.orderNumber = orderNumber;
        this.name = name;
        this.createdDate = LocalDateTime.now();
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public static void main(String[] args) {
        Order tom = new Order("54", "Tom");
        System.out.println(tom.getOrderNumber());
        System.out.println(tom.getName());
        System.out.println(tom.getCreatedDate());
    }

}
