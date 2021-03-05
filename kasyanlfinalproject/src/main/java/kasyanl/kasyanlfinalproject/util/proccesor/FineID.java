package kasyanl.kasyanlfinalproject.util.proccesor;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.menu.Menu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FineID {
    private FineID() {
        throw new UnsupportedOperationException();
    }

    static final Logger log = LoggerFactory.getLogger(FineID.class);

    public static Product fineProductByID(InputNumber inputer, Product newProduct) {
        Menu.menuUpdateProduct();
        int select = inputer.readNumber();
        switch (select) {
            case 1:
                selectCategory(inputer, newProduct);
                break;
            case 2:
               selectName(inputer, newProduct);
                break;
            case 3:
                selectPrice(inputer, newProduct);
                break;
            case 4:
                selectDiscount(inputer, newProduct);
                break;
            default:
                log.info("" +
                        "\n_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _" +
                        "\nТакого варианта выбора нет, повторите его: ");
        }
        return newProduct;
    }


        public static void selectCategory(InputNumber input, Product product) {

            String selectCategory = UpdateCategoryService.updateCategory(input);
            Category category = Category.valueOf(selectCategory);
            product.setCategory(category);
            CrudOperation.readProduct(product);

        }

        public static final String ITERATOR = "_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _";
        public static final String MESSAGE = "Введите новое название: ";

        public static void selectName(InputNumber input, Product product) {
            log.info("" +
                    "\n{}" +
                    "\n{}", ITERATOR, MESSAGE);
            product.setName(input.readString());
            CrudOperation.readProduct(product);
        }

        public static void selectPrice(InputNumber input, Product product) {
            log.info("" +
                    "\n{}" +
                    "\n{}", ITERATOR, MESSAGE);
            product.setPrice(input.readDouble());
            CrudOperation.readProduct(product);
        }

        public static void selectDiscount(InputNumber input, Product product) {
            log.info("" +
                    "\n{}" +
                    "\n{}", ITERATOR, MESSAGE);
            product.setDiscount(input.readDouble());
            CrudOperation.readProduct(product);
        }
    }
