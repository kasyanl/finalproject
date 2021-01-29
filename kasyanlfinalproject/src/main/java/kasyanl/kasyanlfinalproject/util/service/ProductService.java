package kasyanl.kasyanlfinalproject.util.service;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.service.procces.CalculaterActualPrice;
import kasyanl.kasyanlfinalproject.util.repository.ProductDataBase;

public class ProductService {

    private static long idCounter;

    public static Product creatProduct(Category category, String name, double price, double discount) {

        long id = idCounter;
        if (ProductDataBase.listProduct.size() == 0) id = 0;
        else if (ProductDataBase.listProduct.isEmpty()) {
            int i = 0;
            for (Product product : ProductDataBase.listProduct) {
                if (product.getId() == i) i++;
                id = i;
            }
        } else id = ++idCounter;
        double actualPrice = CalculaterActualPrice.calcuiating(price, discount);
        Product product = new Product(id, category, name, price, discount, actualPrice);
        ProductService.readProduct(product);
        return product;
    }

    public static void readProduct(Product product) {
        System.out.println(product);
    }

    public static void deleteProduct() {
        int id = ImputNumberService.readNumber("Введите ID продукта");
        ProductDataBase.listProduct.removeIf(nextProduct -> nextProduct.getId() == id);
    }
}

