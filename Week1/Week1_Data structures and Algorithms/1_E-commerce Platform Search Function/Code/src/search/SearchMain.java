package search;

public class SearchMain {
    public static void main(String[] args) {
        SearchProduct[] products = {
                new SearchProduct(1, "iPhone"),
                new SearchProduct(2, "Dell Laptop"),
                new SearchProduct(3, "Sony Headphones")
        };

        SearchProduct result = SearchUtils.linearSearch(products, "Dell Laptop");
        System.out.println("Linear: " + (result != null ? result.name : "Not found"));

        SearchProduct result2 = SearchUtils.binarySearch(products, "Sony Headphones");
        System.out.println("Binary: " + (result2 != null ? result2.name : "Not found"));
    }
}