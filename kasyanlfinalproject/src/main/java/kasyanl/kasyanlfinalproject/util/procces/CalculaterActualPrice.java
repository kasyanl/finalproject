package kasyanl.kasyanlfinalproject.util.procces;

import kasyanl.kasyanlfinalproject.util.bean.Product;

public class CalculaterActualPrice extends Product {

    public static double calcuiating(){
        Product product = new Product();
        return (product.getPrice() - (product.getPrice() * product.getDiscount() / 100));
    }

}
