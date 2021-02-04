package kasyanl.kasyanlfinalproject.util.service.proccesor.sort;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductInterface;

import java.util.Comparator;
import java.util.List;

public class SortDataBase implements ProductInterface {
    private SortDataBase() {
        throw new UnsupportedOperationException();
    }

    public static void sortByName(List<Product> listProduct){
       Comparator<Product> sortByName = new SortByName();
        listProduct.sort(sortByName);
    }

    public static void sortByCategory(List<Product> listProduct){
        Comparator<Product> sortByCategory = new SortByCategory();
        listProduct.sort(sortByCategory);
    }

    public static void sortByPrice(List<Product> listProduct){
        Comparator<Product> sortByPrice = new SortByPrice();
        listProduct.sort(sortByPrice);
    }

    public static void sortByActualPrice(List<Product> listProduct){
        Comparator<Product> sortByActualPrice = new SortByActualPrice();
        listProduct.sort(sortByActualPrice);
    }
    public static void sortById(List<Product> listProduct){
        Comparator<Product> sortById = new SortById();
        listProduct.sort(sortById);
    }
}