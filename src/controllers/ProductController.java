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
        //? нужно ли циклить или это единичный расчет?
        view.getInputs();
        // Здесь, реализуйте:
        // 1) получение имени товара через модель;
        System.out.print("Наименование товара: " + model.getName()); //или каждая строка должна быть реализована через getOutput
        // 2) вызов методов расчетов доходов и налога; //? здесь чистый доход или до уплаты налогов
        double income = model.calculateIncome();
        double tax = model.calculateTax();
        double netIncome = model.calculateNetIncome();
        // 3) округление расчетных значений;
        Rounder rounder = new Rounder();
        System.out.println("Общий доход, (грн): " + rounder.roundValue(income, 2));
        System.out.println("Сумма налога (грн.): " + rounder.roundValue(tax, 2));
        System.out.println("Чистый доход (грн.): " + rounder.roundValue(netIncome, 2));
        // 4) вывод расчетов по заданному формату.


        String output = "[здесь должен быть вывод по формату]"; //здесь тип String условный и его можно заменить?

        view.getOutput(output);
    }
}
