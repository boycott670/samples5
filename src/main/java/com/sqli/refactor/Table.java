package com.sqli.refactor;

public class Table {
    private int tableId;
    private int nbrOfSeats;
    private Order order;

    public Table(int tableId, int nbrOfSeats) {
        this.tableId = tableId;
        this.nbrOfSeats = nbrOfSeats;
        order = new Order();
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public int getNbrOfSeats() {
        return nbrOfSeats;
    }

    public void setNbrOfSeats(int nbrOfSeats) {
        this.nbrOfSeats = nbrOfSeats;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
