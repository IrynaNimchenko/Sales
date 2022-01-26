package views;

import models.Product;
import utils.Validator;

import java.util.Scanner;

// View
public class SalesView {

    String title;
    String name;
    int quantity;
    double price;
    Scanner scanner;

    // Здесь, создайте конструктор данного класса,
    // который в параметре содержит переменную типа модели.
    public SalesView( Product model) {
        this.name = model.getName();
        this.quantity = model.getQuantity();
        this.price = model.getPrice();
    }


    public void getInputs(Product model) {

        scanner = new Scanner(System.in);

        title = "Введите наименование товара: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацию значения
        // через валидатор, установку валидного значения через модель.
        System.out.println(title);
        Validator validator=new Validator();
        model.setName(validator.validateName(scanner));

        title = "Введите количество: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        System.out.println(title);
        model.setQuantity(validator.validateQuantityInput(scanner));

        title = "Введите цену: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        System.out.println(title);
        model.setPrice(validator.validatePriceInput(scanner));

        scanner.close();
    }

    public void getOutput(String output) {System.out.println(output);
    }
}
