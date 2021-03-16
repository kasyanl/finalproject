package kasyanl.kasyanlfinalproject.proccesor;

import kasyanl.kasyanlfinalproject.bean.Product;
import kasyanl.kasyanlfinalproject.repository.ProductRepository;

import java.util.Comparator;
import java.util.List;

public final class SortDataBase implements ProductRepository {
    private SortDataBase() {
        throw new UnsupportedOperationException();
    }

    public static void sortByName(List<Product> listProduct) {
        Comparator<Product> sortByName = new SortByName();
        listProduct.sort(sortByName);
    }

    public static void sortByCategory(List<Product> listProduct) {
        Comparator<Product> sortByCategory = new SortByCategory();
        listProduct.sort(sortByCategory);
    }

    public static void sortByPrice(List<Product> listProduct) {
        Comparator<Product> sortByPrice = new SortByPrice();
        listProduct.sort(sortByPrice);
    }

    public static void sortByActualPrice(List<Product> listProduct) {
        Comparator<Product> sortByActualPrice = new SortByActualPrice();
        listProduct.sort(sortByActualPrice);
    }

    public static void sortById(List<Product> listProduct) {
        Comparator<Product> sortById = new SortById();
        listProduct.sort(sortById);
    }

    static class SortByName extends Product implements Comparator<Product> {

        @Override
        public int compare(Product o1, Product o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    static class SortByActualPrice implements Comparator<Product> {

        @Override
        public int compare(Product o1, Product o2) {
            return (int) o1.getActualPrice() - (int) o2.getActualPrice();
        }
    }

    static class SortByCategory implements Comparator<Product> {

        @Override
        public int compare(Product o1, Product o2) {
            return o1.getCategory().compareTo(o2.getCategory());
        }
    }

    static class SortById implements Comparator<Product> {

        @Override
        public int compare(Product o1, Product o2) {
            return (int) o1.getId() - (int) o2.getId();
        }
    }

    static class SortByPrice implements Comparator<Product> {

        @Override
        public int compare(Product o1, Product o2) {
            return (int) o1.getPrice() - (int) o2.getPrice();
        }
    }
}