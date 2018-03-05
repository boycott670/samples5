package com.sqli.refactor;

public class IndividualOrder {

    private String customer;
    private String order;

    public IndividualOrder(String customer, String order) {
        this.customer = customer;
        this.order = order;
    }

    public void writeInto(OrderView view) {
        view.setOrder(order);
    }

}
