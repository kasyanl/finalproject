package kasyanl.kasyanlfinalproject.repository;

import kasyanl.kasyanlfinalproject.bean.Product;

import java.math.BigDecimal;

public abstract class СalculatingDiscount implements ProductInterface{

    protected BigDecimal discount;
    protected BigDecimal actualPrice;

    Product product = new Product();

    protected BigDecimal calculating (){
        actualPrice = product.getPrice().multiply(discount).divide(new BigDecimal(100));
        return actualPrice;
    }
}
