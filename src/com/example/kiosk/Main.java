package com.example.kiosk;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List <MenuItem> burgerItems = new ArrayList<>();
        // Menu 객체 생성하면서 카테고리 이름 설정
        burgerItems.add(new MenuItem("HamHamBurger",4.5F,"비프패티를 기반으로 야채가 들어간 기본버거"));
        burgerItems.add(new MenuItem("ShackBurger",5.5F,"토마토, 양상추, 쉑소스가 토핑된 버거"));
        burgerItems.add(new MenuItem("BaconShack",5.9F,"베이컨, 체리 페퍼에 쉑소스가 토핑된 버거"));
        burgerItems.add(new MenuItem("Cheeseburger",5.9F,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        Menu burgerMenu = new Menu("Burger",burgerItems);

        List <MenuItem> drinksItems = new ArrayList<>();
        drinksItems.add(new MenuItem("Cider",2.0F,"시원한 사이다"));
        drinksItems.add(new MenuItem("Coca-Cola",2.0F,"시원한 콜라"));
        drinksItems.add(new MenuItem("Milkshake",3.0F,"밀크쉐이크 맛집"));
        Menu drinksMenu = new Menu("Drinks",drinksItems);

        List <MenuItem> dessertsItems = new ArrayList<>();
        dessertsItems.add(new MenuItem("Gelato",3.0F,"초코, 딸기, 바닐라"));
        Menu dessertsMenu = new Menu("Desserts",dessertsItems);

        List <Menu> allMenu = new ArrayList<>();

        allMenu.add(burgerMenu);
        allMenu.add(drinksMenu);
        allMenu.add(dessertsMenu);

        Kiosk kiosk = new Kiosk(allMenu);

        kiosk.start();
    }

}
