package ecommerce;

import java.util.Arrays;
import java.util.Comparator;

public class SearchUtils {

    // Linear Search by Product Name
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }

    // Binary Search by Product Name (Array must be sorted by productName)
    public static Product binarySearch(Product[] products, String targetName) {
        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int result = products[mid].productName.compareToIgnoreCase(targetName);

            if (result == 0) return products[mid];
            else if (result < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }

    // Sort products by productName (for binary search)
    public static void sortProductsByName(Product[] products) {
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
    }
}
