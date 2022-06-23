package my.edu.univeristy;

public class Order {

    private int idOrder;
    private Product products[];
    private static int orderCounter;
    private int productCounter;
    private static final int MAX_PRODUCTS = 10;


    public Order(){
        this.idOrder = ++Order.orderCounter;
        this.products = new Product[Order.MAX_PRODUCTS];
    }

    public void addProduct(Product product){
        if(this.productCounter < Order.MAX_PRODUCTS){
            products[this.productCounter++] = product;
        }
        else{
            System.out.println("The maximum of products have been exceeded. " + Order.MAX_PRODUCTS);
        }
    }

    public double calculateTotal(){
        double total = 0;
        for(int i = 0; i < this.productCounter; i++){
            if(this.products[i] != null)
            total = total + this.products[i].getPrice();
        }
        return total;
    }

    public void showOrder(){
        System.out.println("idOrder = " + idOrder);
        double orderTotal = calculateTotal();
        System.out.println("Total of the order: $" + orderTotal);
        System.out.println("Products of the order:");
        for(int i = 0; i < this.products.length; i++){
            System.out.println("products " + i + ": = " +  products[i]);
        }


    }

}
