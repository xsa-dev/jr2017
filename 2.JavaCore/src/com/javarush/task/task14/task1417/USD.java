package com.javarush.task.task14.task1417;

/**
 * Created by xsd on 23.04.2017 with love.
 * :)
 *
 * @author xsd
 * @author alekseysavin.com
 * @version 0.1
 */
public class USD extends Money {
    @Override
    public String getCurrencyName() {
        return "USD";
    }

    public USD(double amount) {
         super(amount);
    }
}
