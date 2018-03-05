package com.sqli.refactor;

import com.sqli.refactor.parse.CommaOrderParser;
import com.sqli.refactor.presenter.CommaOrderPresenter;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private static int TABLE_COUNTER = 0;

    private List<Table> tables;
    private OrderParser parser = new CommaOrderParser();
    private OrderPresenter presenter = new CommaOrderPresenter();

    public Restaurant() {
        tables = new ArrayList<>();
    }

    public int initTable(int nbrOfSeats) {
        tables.add(new Table(TABLE_COUNTER, nbrOfSeats));
        return TABLE_COUNTER++;
    }

    public void customerSays(int tableId, String individualOrder) {
        tables.stream()
                .filter(t -> t.getTableId() == tableId)
                .findAny()
                .get()
                .getOrder()
                .addIndividualOrder(parser.customer(individualOrder), parser.individualOrder(individualOrder));
    }

    public String createOrder(int tableId) {
        return tables.stream()
                .filter(t -> t.getTableId() == tableId)
                .map(Table::getOrder)
                .map(order -> order.present(presenter))
                .findAny()
                .get();
    }
}
