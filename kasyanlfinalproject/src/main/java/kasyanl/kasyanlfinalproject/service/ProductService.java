package kasyanl.kasyanlfinalproject.service;

import kasyanl.kasyanlfinalproject.bean.Product;
import kasyanl.kasyanlfinalproject.repository.ProductInterface;

public class ProductService implements ProductInterface {

    Product product = new Product();

    long countId = 0;

    public void creatProduct(){
        productMap.put(product.getId(), product);
        product.setId(countId++);
    }

    public void readeProduct(){
        Product thisProduct = productMap.get(product.getId());
    }

    public void removeProduct(long id){

        if(productMap.get(id)!=null){
            productMap.remove(product.getId(), product);
        }
    }
    public boolean updateProduct(long id, Product product1){



    }
}
