package com.example.kiosk;

/**
 * 개별 음식 항목을 관리하는 클래스
 */
public class MenuItem {

    private String name; //이름
    private float price; //가격
    private String comment; //설명

    /**
     * MenuItem 생성자
     * @param name 메뉴 이름
     * @param price 메뉴 가격
     * @param comment 메뉴에 대한 설명
     */
    public MenuItem (String name, float price, String comment) {
        this.name = name;
        this.price = price;
        this.comment = comment;
    }

    /**
     * 메뉴 이름 반환
     * @return 메뉴 이름
     */
    public String getName() {
        return name;
    }

    /**
     * 메뉴 가격 반환
     * @return 메뉴 가격
     */
    public float getPrice() {
        return price;
    }

    /**
     * 메뉴 설명 반환
     * @return 메뉴 설명
     */
    public String getComment() {
        return comment;
    }

    /**
     * 메뉴 이름 설정
     * @param name 새로운 메뉴 이름
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 메뉴 가격 설정
     * @param price 새로운 메뉴 가격
     */
    public void setPrice(float price) {
        this.price = price;
    }


    /**
     * 메뉴 설명 설정
     * @param comment 새로운 메뉴 설명
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * 메뉴 이름을 반환하는 toString 메서드
     * @return 메뉴 이름
     */
    @Override
    public String toString() {
        return name;
    }

}
