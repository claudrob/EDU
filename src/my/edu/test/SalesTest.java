package my.edu.test;

import my.edu.univeristy.Order;
import my.edu.univeristy.Product;

public class SalesTest {

    public static void main(String[] args) {
        Product product1 = new Product("Shirt", 50.00);
        Product product2 = new Product("Pants", 100.00);

        Order order = new Order();
        order.addProduct(product1);
        order.addProduct(product2);
        order.showOrder();

    }

}
