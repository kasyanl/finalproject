package kasyanl.kasyanlfinalproject.util.service.proccesor;

import kasyanl.kasyanlfinalproject.util.bean.Product;

public class CalculaterActualPrice{

    Product product;

    public CalculaterActualPrice(Product product) {
        this.product = product;
    }

    public static double calculating(double price, double discount) {
        return (price - (price * discount / 100));
    }

}
