package com.example.kiosk;

/**
 * 개별 음식 항목을 관리하는 클래스
 */
public class MenuItem {
    //이름, 가격, 설명

    private String name;
    private float price;
    private String comment;

    public MenuItem (String name, float price, String comment) {
        this.name = name;
        this.price = price;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public String getComment() {
        return comment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return name;
    }

}
