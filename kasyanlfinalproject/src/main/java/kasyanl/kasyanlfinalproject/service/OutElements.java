package kasyanl.kasyanlfinalproject.service;

import kasyanl.kasyanlfinalproject.bean.Category;
import kasyanl.kasyanlfinalproject.bean.Product;
import java.util.List;
public class OutElements {

    Product thisProduct;

    public OutElements(Product thisProduct) {
        this.thisProduct = thisProduct;
    }

    long id;
    Category category;
    String name;
    double price;
    double discount;
    double actualPrice;

    public String outValueProduct(List<Product> listProduct, Product product){
        id = product.getId();
        category = product.getCategory();
        name = product.getName();
        price = product.getPrice();
        discount = product.getDiscount();
        actualPrice = (price - (price*discount/100));

        return "" +
                "\n___________" +
                "\nProduct information:" +
                "\nId: " + id +
                "\nCategory: " + category +
                "\nName: " + name +
                "\nRegular price: "+ price +
                "\nDiscount: " + discount + "%" +
                "\nActual price: " + actualPrice +
                "\n";
    }
}
