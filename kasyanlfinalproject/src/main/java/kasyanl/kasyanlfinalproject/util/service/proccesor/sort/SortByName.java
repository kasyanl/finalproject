package kasyanl.kasyanlfinalproject.util.service.proccesor.sort;

import kasyanl.kasyanlfinalproject.util.bean.Product;

import java.util.Comparator;

public class SortByName extends Product implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}