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
    private static final double TAX_RATE = 0.05;

    // Обеспечьте доступ к полям модели через getters и setters
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
    @Override
    public double calculateIncome(double price, int quantity) {
        return quantity * price;
    }

    // Расчёт суммы налога с продаж.
    @Override
    public double calculateTax(double income) {
        return income * TAX_RATE;
    }

    // Расчёт чистого дохода, после уплаты налога.
    @Override
    public double calculateIncome(double income, double tax) {
        return income - tax;
    }

}
