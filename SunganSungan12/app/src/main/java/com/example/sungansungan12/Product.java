package com.example.sungansungan12;

public class Product {
    private String name;
    private String price;
    private String imageUrl;

    public Product(String name, String price, String imageUrl) {
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    // Getter 및 Setter 메서드는 필요에 따라 추가로 작성합니다.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}