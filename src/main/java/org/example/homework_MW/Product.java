package org.example.hw;

import java.math.BigDecimal;

public abstract class Product {
    private String name;
    private BigDecimal price;

    
    public Product() {
    }

    /**
     * @param name  Product's name
     * @param price Product's price
     */
    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    /**
     * @return Product's name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name Product's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Product's price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @param price Product's price
     */
    public void setPrice(BigDecimal price) {
        if (price.compareTo(BigDecimal.valueOf(0)) > 0) this.price = price;
        else System.out.println("!=");
    }

    /**
     * @return Product's name и price;
     */
    @Override
    public String toString() {
        return "\"" + name + "\" price: " + price + " euros ";
    }
}
