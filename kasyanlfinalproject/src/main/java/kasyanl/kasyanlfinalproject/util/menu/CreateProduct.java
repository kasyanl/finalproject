package kasyanl.kasyanlfinalproject.util.menu;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.procces.CalculaterActualPrice;
import kasyanl.kasyanlfinalproject.util.repository.ProductDataBase;
import kasyanl.kasyanlfinalproject.util.repository.ProductInterface;
import kasyanl.kasyanlfinalproject.util.service.ImputNumberService;
import kasyanl.kasyanlfinalproject.util.service.ProductService;
import kasyanl.kasyanlfinalproject.util.procces.UpdateCategoryService;

public class CreateProduct implements ProductInterface {

    private static long idCounter;

    public static Product createNewProduct() {
        long id = 0;
        if (ProductDataBase.listProduct.size() == 0) id =0;
        else if (ProductDataBase.listProduct.size() > 0) {
            int i = 0;
            for (Product product : ProductDataBase.listProduct) {
                if (product.getId() == i) i++;
                id = i;
            }
        } else id = ++idCounter;
        String selectCategory = UpdateCategoryService.updateCategory();
        Category category = Category.valueOf(selectCategory);
        String name = ImputNumberService.readString("Введите название продукта: ");
        double price = ImputNumberService.readDouble("Введите цену продукта (BYN): ");
        double discount = ImputNumberService.readDouble("Введите скидку продукта (%): ");
        double actualPrice = CalculaterActualPrice.calcuiating();

        return new Product(id, category, name, price, discount, actualPrice);
    }

}

