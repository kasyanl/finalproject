package kasyanl.kasyanlfinalproject.util.bean;

import java.util.Objects;

public class Product {

    private long id;
    private Category category;
    private String name;
    private double price;
    private double discount;
    private double actualPrice;

    public Product(long id, Category category, String name, double price, double discount, double actualPrice) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.price = price;
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

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setActualPrice(double actualPrice) {
        this.actualPrice = actualPrice;
    }

    public double getActualPrice() {
        return actualPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Double.compare(product.price, price) == 0 && Double.compare(product.discount, discount) == 0 && Double.compare(product.actualPrice, actualPrice) == 0 && category == product.category && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, name, price, discount, actualPrice);
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ",category=" + category +
                ", name='" + name +
                "', price=" + price + " BYN" +
                ", discount=" + discount + " %" +
                ", actualPrice=" + (price - (price * discount / 100)) + " BYN" +
                '}';
    }
}
