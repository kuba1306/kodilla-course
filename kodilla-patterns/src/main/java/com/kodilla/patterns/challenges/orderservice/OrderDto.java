package com.kodilla.patterns.challenges.orderservice;

public class OrderDto {

    public Customer customer;
    public boolean isOrdered;

    public OrderDto(Customer customer, boolean isOrdered) {
        this.customer = customer;
        this.isOrdered = isOrdered;
    }

    public Customer getUser() {
        return customer;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}