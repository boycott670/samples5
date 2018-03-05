package com.sqli.refactor;

import com.sqli.refactor.parse.CommaOrderParser;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class Order {
    private List<IndividualOrder> individualOrders;

    public Order() {
        individualOrders = new ArrayList<>();
    }

    public void addIndividualOrder(String customer, String order) {
        int ordersCount = individualOrders.size();

        if (ordersCount == 0)
            individualOrders.add(new IndividualOrder(customer, order));
        else
            individualOrders.add("Same".equals(order) ? individualOrders.get(ordersCount - 1) : new IndividualOrder(customer, order));
    }

    public String present(OrderPresenter presenter) {
        return presenter.present(individualOrders);
    }
}
