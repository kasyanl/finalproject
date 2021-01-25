package kasyanl.kasyanlfinalproject.service;

import kasyanl.kasyanlfinalproject.bean.Category;
import kasyanl.kasyanlfinalproject.bean.Product;
import kasyanl.kasyanlfinalproject.repository.ProductInterface;

import java.util.Map;

public class ProductService implements ProductInterface {

    Product product = new Product();


    public Product creatProduct(Map<Long, Product> productMap, Category category, String name, double price, double discount) {
        long id;
        if (productMap.size() == 0) {
            id = 1;
        } else {
            id = productMap.get(productMap.size() - 1).getId() + 1;
        }
        return new Product(id, category, name, price, discount);
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

    public static Product createNewProduct(Map<Long, Product> productMap) {
        ImputNumberService imputNumberService = new ImputNumberService();
        long id;
        if (productMap.size() == 0) {
            id = 1;
        } else {
            id = productMap.get(productMap.size() - 1).getId() + 1;
        }
        String selectCategory = imputNumberService.readString("Введите одну из категорий:"+
                "\nFRUITS," +
                "\nBERRIES," +
                "\nVEGETABLES");
        selectCategory = selectCategory.toUpperCase();
        Category category = Category.valueOf(selectCategory);
        String name = imputNumberService.readString("Введите название продукта: ");
        double price = imputNumberService.readDouble("Введите цену продукта: ");
        double discount = imputNumberService.readDouble("Введите скидку продукта: ");


        return new Product(id, category, name, price, discount);
    }

}
