package controllers;

import models.Product;
import utils.Rounder;
import views.SalesView;

// Controller
public class ProductController {
    Product model;
    SalesView view;

    // Конструктор
    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {
        view.getInputs();
        // Здесь, реализуйте:
        // 1) получение имени товара через модель;
        System.out.println("Наименование товара: " + model.getName());
        // 2) вызов методов расчетов доходов и налога;
        double income = model.calculateIncome(model.getPrice(), model.getQuantity());
        double tax = model.calculateTax(income);
        double netIncome = model.calculateIncome(income, tax);
        // 3) округление расчетных значений;
        // 4) вывод расчетов по заданному формату.

        String output = "Общий доход, (грн): " + Rounder.roundValue(income) + "\nСумма налога (грн.): " + Rounder.roundValue(tax) + "\nЧистый доход (грн.): " + Rounder.roundValue(netIncome);

        view.getOutput(output);
    }
}
