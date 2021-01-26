package kasyanl.kasyanlfinalproject.service;

import kasyanl.kasyanlfinalproject.bean.Category;
import kasyanl.kasyanlfinalproject.bean.Product;
import kasyanl.kasyanlfinalproject.repository.ProductInterface;

import java.util.Map;

import static kasyanl.kasyanlfinalproject.repository.ProductInterface.productMap;

public class OutElements {

    Product product = new Product();

    long id;
    Category category;
    String name;
    double price;
    double discount;
    double actualPrice;

    public String outValueProduct(Map<Long, Product> productMap, Product product){
        id = product.getId();
        category = product.getCategory();
        name = product.getName();
        price = product.getPrice();
        discount = product.getDiscount();

        return "Product information:" +
            "\nId: " + id +
            "\nCategory: " + category +
            "\nName: " + name +
            "\nRegular price: "+ price +
            "\nDiscount: " + discount + "%" +
            "\nActual price: " + calculating();
    }


    public double calculating() {
        price = product.getPrice();
        discount = product.getDiscount();
        actualPrice = (price - (price*discount/100));
        return actualPrice;
    }
}
