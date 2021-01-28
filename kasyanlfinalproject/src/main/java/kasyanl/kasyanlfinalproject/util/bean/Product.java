package kasyanl.kasyanlfinalproject.util.bean;

import java.util.Objects;

public class Product {

    private String name;
    private long id;
    private double price;
    private Category category;
    private double discount;
    private double actualPrice;

    public Product(long id, Category category, String name, double price, double discount, double actualPrice) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.category = category;
        this.discount = discount;
        this.actualPrice = actualPrice;
    }

    public Product() {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setActualPrice(double actualPrice) {
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
                "id=" + id +
                ",category=" + category +
                ", name='" + name +
                "', price=" + price+" BYN" +
                ", discount=" + discount+" %" +
                ", actualPrice=" + (price - (price * discount / 100))+" BYN" +
                '}';
    }
}
