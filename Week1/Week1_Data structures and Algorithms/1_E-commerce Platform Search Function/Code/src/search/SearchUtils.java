package search;


import java.util.Arrays;
import java.util.Comparator;

public class SearchUtils {
    public static SearchProduct linearSearch(SearchProduct[] list, String target) {
        for (SearchProduct p : list) {
            if (p.name.equalsIgnoreCase(target)) return p;
        }
        return null;
    }

    public static SearchProduct binarySearch(SearchProduct[] list, String target) {
        Arrays.sort(list, Comparator.comparing(p -> p.name.toLowerCase()));
        int left = 0, right = list.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = list[mid].name.compareToIgnoreCase(target);
            if (cmp == 0) return list[mid];
            if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }
}