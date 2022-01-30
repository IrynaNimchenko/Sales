package base;

import models.Product;

public interface Income {

    double calculateIncome();

    double calculateIncome(double price, int quantity);

    double calculateNetIncome();

    double calculateNetIncome(double price, int quantity);
}
