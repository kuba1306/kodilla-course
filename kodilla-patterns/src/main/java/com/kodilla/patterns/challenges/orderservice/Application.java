package com.kodilla.patterns.challenges.orderservice;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new OrderServiceImpl(), new OrderRepositoryImpl());
        productOrderService.process(orderRequest);
    }
}