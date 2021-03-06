package views;

import models.Product;
import utils.Validator;

import java.util.Scanner;

// View
public class SalesView {

    private String title;
    private String name;
    private int quantity;
    private double price;
    private Scanner scanner;

    // Здесь, создайте конструктор данного класса,
    // который в параметре содержит переменную типа модели.
    Product product;

    public SalesView(Product model) {
        this.product = model;
    }

    public void getInputs() {

        scanner = new Scanner(System.in);

        title = "Введите наименование товара: ";
        // Здесь, реализуйте вывод сообщения о необходимости
        // ввода соответствующего значения, валидацию значения
        // через валидатор, установку валидного значения через модель.
        System.out.println(title);
        name=Validator.validateName(scanner);
        product.setName(name);

        title = "Введите количество: ";
        // Здесь, реализуйте вывод сообщения о необходимости
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        System.out.println(title);
        quantity=Validator.validateQuantityInput(scanner);
        product.setQuantity(quantity);

        title = "Введите цену: ";
        // Здесь, реализуйте вывод сообщения о необходимости
        // ввода соответствующего значения, валидацию значения
        // через валидатор, установку валидного значения через модель.
        System.out.println(title);
        price=Validator.validatePriceInput(scanner);
        product.setPrice(price);

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
