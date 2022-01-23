package models;

import base.Fiscal;
import base.Income;

// Model.
// Примените интерфейсы Income, Fiscal, переопределите их методы.
public class Product implements Fiscal, Income {

    // Объявление полей модели
    private String name;
    private int quantity;
    private double price;
    // Налоговоу ставку объявите в виде константы
    // здесь ...
    private static final double TAX_RATE=0.05; //оъявила


    // Обеспечьте доступ к полям модели через getters и setters
    // здесь ...
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Переопределите методы реализуемых интерфейсов.

    // Расчёт дохода от продаж, до уплаты налога.
    // здесь ...

    @Override
    public double calculateIncome(int quantity, double price){
        return quantity*price;
    };

    // Расчёт суммы налога с продаж.
    // здесь ...
    @Override
    public double calculateTax(double income, TAX_RATE){
        return income*TAX_RATE;
    }

    // Расчёт чистого дохода, после уплаты налога.
    // здесь ...
    @Override
    public double calculateNetIncome(double income, double tax){
        return income-tax;
    }
}
