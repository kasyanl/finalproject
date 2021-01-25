package kasyanl.kasyanlfinalproject.service;

import kasyanl.kasyanlfinalproject.bean.Category;
import kasyanl.kasyanlfinalproject.bean.Product;
import kasyanl.kasyanlfinalproject.repository.ProductInterface;

import java.util.Map;

public class ProductService implements ProductInterface {

    Product product = new Product();

    long countId = 0;

    public Product creatProduct(Map<Long, Product> productMap, Category category, String name, double price, double discount){
        productMap.put(product.getId(), product);
        product.setId(countId++);
        return new Product(product.getCategory(), product.getName(), product.getPrice(), product.getDiscount());
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
        boolean update = false;
        if(productMap.get(id)!=null){
            productMap.put(product.getId(), product);
            update = true;
        }
        return update;
    }

}
