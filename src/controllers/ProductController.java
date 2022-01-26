package controllers;

import base.Income;
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
        view.getInputs(model);
        // Здесь, реализуйте:
        // 1) получение имени товара через модель;
        System.out.println("Наименование товара: " + model.getName()); //или каждая строка должна быть реализована через getOutput
        // 2) вызов методов расчетов доходов и налога; //? переделать через перегруженный метод
        double income = model.calculateIncome(model);
        double tax = model.calculateTax();
        double netIncome = model.calculateNetIncome(model);
        // 3) округление расчетных значений;
        Rounder rounder = new Rounder();
        // 4) вывод расчетов по заданному формату.

        String output = "Общий доход, (грн): " + rounder.roundValue(income) + "\nСумма налога (грн.): " + rounder.roundValue(tax) + "\nЧистый доход (грн.): " + rounder.roundValue(netIncome);

        view.getOutput(output);
    }
}
