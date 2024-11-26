package com.example.kiosk;

/**
 * 개별 음식 항목을 관리하는 클래스
 */
public class MenuItem {
    //이름, 가격, 설명

    String name;
    float price;
    String comment;

    public MenuItem (String name, float price, String comment) {
        this.name = name;
        this.price = price;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return name;
    }

}
