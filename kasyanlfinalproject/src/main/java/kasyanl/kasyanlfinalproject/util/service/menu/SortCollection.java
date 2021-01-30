package kasyanl.kasyanlfinalproject.util.service.menu;

import kasyanl.kasyanlfinalproject.util.bean.Product;

import java.util.Comparator;

public class SortCollection extends Product implements Comparator<Product> {


    public static Comparator<Product> NameComparator = new Comparator<Product>() {

        @Override
        public int compare(Product o1, Product o2) {
            return 0;
        }
    };

    @Override
    public int compare(Product o1, Product o2) {
        return 0;
    }
}


