package base;

import models.Product;

public interface Income {

    double calculateIncome();

    double calculateIncome(Product product);

    double calculateNetIncome();

    double calculateNetIncome(Product product);
}
