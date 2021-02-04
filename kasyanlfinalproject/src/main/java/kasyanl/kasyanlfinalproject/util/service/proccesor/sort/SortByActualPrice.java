package kasyanl.kasyanlfinalproject.util.service.proccesor.sort;

import kasyanl.kasyanlfinalproject.util.bean.Product;

import java.util.Comparator;

public class SortByActualPrice implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return (int) o1.getActualPrice() - (int) o2.getActualPrice();
    }
}
