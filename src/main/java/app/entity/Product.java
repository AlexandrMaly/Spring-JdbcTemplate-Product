package app.entity;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Product {

    private Long id;
    private String name;
    private String quota;
    private String price;

    public Product() {
    }

    public Product(String name, String quota, String price) {
        this.name = name;
        this.quota = quota;
        this.price = price;
    }

    public Product(Long id, String name, String quota, String price) {
        this.id = id;
        this.name = name;
        this.quota = quota;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(name, product.name) && Objects.equals(quota, product.quota) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, quota, price);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuota() {
        return quota;
    }

    public void setQuota(String quota) {
        this.quota = quota;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product " +
                "id = " + id +
                ", name = " + name +
                ", quota = " + quota +
                ", price = " + price;
    }
}
