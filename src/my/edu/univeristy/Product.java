package my.edu.univeristy;

public class Product {

    private final int idProduct;
    private String name;
    private double price;
    private static int productsCounter;

    private Product(){
        this.idProduct = ++Product.productsCounter;
    }

    public Product(String name, double price){
        this();
        this.name = name;
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getProductsCounter() {
        return productsCounter;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
