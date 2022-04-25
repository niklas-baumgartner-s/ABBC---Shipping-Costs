package ch.fhnw.acrm.data.domain;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private Double price;
    @Column(name = "max_products")
    private Integer maxProducts;
    @Column(name = "min_space")
    private Double minSpace;
    @Column(name = "discount_quant")
    private Integer discountQuant;

    public Integer getDiscountQuant() {
        return discountQuant;
    }

    public void setDiscountQuant(Integer discountQuant) {
        this.discountQuant = discountQuant;
    }

    public Double getMinSpace() {
        return minSpace;
    }

    public void setMinSpace(Double minSpace) {
        this.minSpace = minSpace;
    }

    public Integer getMaxProducts() {
        return maxProducts;
    }

    public void setMaxProducts(Integer maxProducts) {
        this.maxProducts = maxProducts;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}