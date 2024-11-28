package com.example.kiosk;
import java.util.List;
/**
 * MenuItem 클래스를 관리하는 클래스
 * 카테고리를 관리. 각 카테고리에는 여러 menuItem이 포함되어 있음
 */
public class Menu {
    private List<MenuItem> menuItems; // 메뉴 아이템/카테고리에 속해있는 아이템들
    private String categoryName; // 카테고리 이름

    /**
     * Menu 클래스 생성자
     * @param categoryName 카테고리 이름
     * @param menuItems 카테고리에 속해있는 아이템들
     */
    public Menu(String categoryName, List<MenuItem> menuItems) {
        this.categoryName = categoryName;
        this.menuItems = menuItems;
    }

    /**
     * 메뉴 아이템 반환
     * @return 메뉴 아이템
     */
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    /**
     * 카테고리 이름 반환
     * @return 카테고리 이름
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 메뉴 아이템 설정
     * @param menuItems 새로운 메뉴 아이템
     */
    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    /**
     * 카테고리 이름 설정
     * @param categoryName 세로운 카테고리 이름
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * 카테고리 이름을 반환하는 toString 메서드
     * @return 카테고리 이름
     */
    @Override
    public String toString() {
        return categoryName;
    }
}
