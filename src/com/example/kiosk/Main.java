package com.example.kiosk;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<MenuItem> menuItems = new ArrayList<>();
        List <MenuItem> items = new ArrayList<>();

        items.add(new MenuItem("HamHamBurger",4.5F,"비프패티를 기반으로 야채가 들어간 기본버거"));
        items.add(new MenuItem("ShackBurger",5.5F,"토마토, 양상추, 쉑소스가 토핑된 버거"));
        items.add(new MenuItem("BaconShack",5.9F,"베이컨, 체리 페퍼에 쉑소스가 토핑된 버거"));
        items.add(new MenuItem("Cheeseburger",5.9F,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));

        Kiosk kiosk = new Kiosk(items);

        kiosk.start();
    }

}
