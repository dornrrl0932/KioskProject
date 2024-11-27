package com.example.kiosk;
import java.util.List;
/**
 * MenuItem 클래스를 관리하는 클래스
 * 예를 들어, 버거 메뉴, 음료 메뉴 등 각 카테고리 내에 여러 MenuItem을 포함
 */
public class Menu {
    private List<MenuItem> menuItems;
    private String categoryName;

    public Menu(String categoryName, List<MenuItem> menuItems) {
        this.categoryName = categoryName;
        this.menuItems = menuItems;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public String toString() {
        return categoryName;
    }
}
