package kasyanl.kasyanlfinalproject.bean;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {

    private String name;
    private long id;
    private BigDecimal price;
    private Category category;
    private BigDecimal discount;
    private BigDecimal actualPrice;

    public Product(String name, long id, BigDecimal price, Category category, BigDecimal discount, BigDecimal actualPrice) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.category = category;
        this.discount = discount;
        this.actualPrice = actualPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(BigDecimal actualPrice) {
        this.actualPrice = actualPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Objects.equals(name, product.name) && Objects.equals(price, product.price) && category == product.category && Objects.equals(discount, product.discount) && Objects.equals(actualPrice, product.actualPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, price, category, discount, actualPrice);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", category=" + category +
                ", discount=" + discount +
                ", actualPrice=" + actualPrice +
                '}';
    }
}
