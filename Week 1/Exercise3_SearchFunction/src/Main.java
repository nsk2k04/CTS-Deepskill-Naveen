package ecommerce;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "iPhone", "Electronics"),
                new Product(102, "Samsung TV", "Electronics"),
                new Product(103, "Levi's Jeans", "Apparel"),
                new Product(104, "Sony Headphones", "Electronics"),
                new Product(105, "Dell Laptop", "Computers")
        };

        System.out.println("Linear Search:");
        Product found1 = SearchUtils.linearSearch(products, "Dell Laptop");
        System.out.println(found1 != null ? "Found: " + found1 : "Not Found");

        System.out.println("\nBinary Search:");
        SearchUtils.sortProductsByName(products);
        Product found2 = SearchUtils.binarySearch(products, "Dell Laptop");
        System.out.println(found2 != null ? "Found: " + found2 : "Not Found");
    }
}
