package kasyanl.kasyanlfinalproject.repository;

import kasyanl.kasyanlfinalproject.bean.Product;

import java.math.BigDecimal;

public abstract class СalculatingDiscount implements ProductInterface{

    Product product = new Product();

    protected BigDecimal calculating (){
        return product.getPrice().multiply(product.getDiscount()).divide(new BigDecimal(100));
    }
}
