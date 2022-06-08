package com.kodilla.patterns.challenges.orderservice;

public class OrderRepositoryImpl implements OrderRepository {

    @Override
    public boolean createOrder(OrderRequest orderRequest) {
        System.out.println("Zamówienie: " + orderRequest.getOrderNumber() + " zostało przekazane do bazy danych");
        return true;
    }
}