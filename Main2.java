import java.io.*;

class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String category;
    private double price;

    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public void printDetails() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Category: " + category);
        System.out.println("Product Price: " + price);
    }
}

public class Main2 {
    public static void main(String[] args) {
        serializeProduct();
        Product deserializedProduct = deserializeProduct();
        if (deserializedProduct != null) {
            System.out.println("Deserialized Product Details:");
            deserializedProduct.printDetails();
        }
    }

    public static void serializeProduct() {
        try {
            FileOutputStream fileOut = new FileOutputStream("product.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            Product product = new Product(1, "Laptop", "Electronics", 999.99);
            objectOut.writeObject(product);
            objectOut.close();
            fileOut.close();
            System.out.println("Product object has been serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Product deserializeProduct() {
        Product product = null;
        try {
            FileInputStream fileIn = new FileInputStream("product.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            product = (Product) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            System.out.println("Product object has been deserialized");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return product;
    }
}
