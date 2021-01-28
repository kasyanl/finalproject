package kasyanl.kasyanlfinalproject.util.service;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import java.util.List;

public class OutElementsService {

    Product thisProduct;

    public OutElementsService(Product thisProduct) {
        this.thisProduct = thisProduct;
    }

    static public String outValueProduct(List<Product> listProduct, Product product){
        long id = product.getId();
        Category category = product.getCategory();
        String name = product.getName();
        double price = product.getPrice();
        double discount = product.getDiscount();
        double actualPrice = (price - (price*discount/100));

        return "" +
                "\n___________" +
                "\nProduct information:" +
                "\nId: " + id +
                "\nCategory: " + category +
                "\nName: " + name +
                "\nRegular price: "+ price+" BYN" +
                "\nDiscount: " + discount + " %" +
                "\nActual price: " + actualPrice+" BYN" +
                "\n";
    }

}
