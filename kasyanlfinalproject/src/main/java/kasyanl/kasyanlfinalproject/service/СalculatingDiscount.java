package kasyanl.kasyanlfinalproject.service;

import kasyanl.kasyanlfinalproject.bean.Product;

public abstract class СalculatingDiscount{

    Product product = new Product();

    protected double calculating (){
        return product.getPrice()*product.getDiscount()/100;
    }
}
