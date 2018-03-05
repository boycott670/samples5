package com.sqli.refactor.presenter;

import com.sqli.refactor.IndividualOrder;
import com.sqli.refactor.Order;
import com.sqli.refactor.OrderPresenter;
import com.sqli.refactor.OrderView;

import java.util.List;

import static java.util.stream.Collectors.joining;

public class CommaOrderPresenter implements OrderPresenter {

    @Override
    public String present(List<IndividualOrder> individualOrders) {
        return individualOrders
                .stream()
                .map(individualOrder -> {
                    OrderViewDTO orderView =
                            new OrderViewDTO();
                    individualOrder.writeInto(orderView);
                    return orderView.toDto();
                })
                .collect(joining(", "));
    }

}
