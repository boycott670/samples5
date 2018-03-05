package com.sqli.refactor.parse;

import com.sqli.refactor.OrderParser;

public class CommaOrderParser implements OrderParser {

    @Override
    public String customer(String input) {
        return input.split(": ")[0];
    }

    @Override
    public String individualOrder(String input) {
        return input.split(": ")[1];
    }
}
