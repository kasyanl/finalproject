package kasyanl.kasyanlfinalproject.util.service.procces;

import kasyanl.kasyanlfinalproject.util.bean.Product;

public class CalculaterActualPrice extends Product {

    Product product;

    public CalculaterActualPrice(Product product) {
        this.product = product;
    }

    public static double calcuiating(double price, double discount){
        return (price - (price* discount/100));
    }

}
