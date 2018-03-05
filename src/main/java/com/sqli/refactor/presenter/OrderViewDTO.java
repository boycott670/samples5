package com.sqli.refactor.presenter;

import com.sqli.refactor.OrderView;

public class OrderViewDTO implements OrderView {

    private String order;

    @Override
    public void setOrder(String order) {
        this.order = order;
    }

    public String toDto() {
        return order;
    }

}
