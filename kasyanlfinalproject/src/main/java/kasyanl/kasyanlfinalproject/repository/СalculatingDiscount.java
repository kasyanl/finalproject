package kasyanl.kasyanlfinalproject.repository;

import kasyanl.kasyanlfinalproject.bean.Product;

import java.math.BigDecimal;

public abstract class СalculatingDiscount implements ProductInterface{

    Product product = new Product();

    protected double calculating (){
        return product.getPrice()*product.getDiscount()/100;
    }
}
