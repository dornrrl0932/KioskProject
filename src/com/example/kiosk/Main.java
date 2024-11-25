package com.example.kiosk;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MenuItem HamHamBurger = new MenuItem("HamHamBurger",4.5F,"비프패티를 기반으로 야채가 들어간 기본버거");
        MenuItem ShackBurger = new MenuItem ("ShackBurger",5.5F,"토마토, 양상추, 쉑소스가 토핑된 버거");
        MenuItem BaconShack = new MenuItem("BaconShack",5.9F,"베이컨, 체리 페퍼에 쉑소스가 토핑된 버거");
        MenuItem Cheeseburger = new MenuItem ("Cheeseburger",5.9F,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");

        ArrayList<String> menuItemsBurger = new ArrayList<String>();

        menuItemsBurger.add("HamHamBurger");
        menuItemsBurger.add("ShackBurger");
        menuItemsBurger.add("BaconShack");
        menuItemsBurger.add("Cheeseburger");

        Scanner scanner = new Scanner(System.in);


        int firstChoice;
        boolean choice = false;

        while (!choice) {
            System.out.println("[ Burger MENU ]");
            for (int i = 0; i < menuItemsBurger.size(); i++ ) {
                System.out.println((i + 1 + ". ") + menuItemsBurger.get(i));
            }
            System.out.println("0. 종료");
            System.out.println("");
            System.out.print("원하시는 메뉴의 번호를 입력해주세요.(종료를 원하실 경우 '0'을 입력해주세요) : ");

            firstChoice = scanner.next();

            switch (firstChoice) {

                case 1:
                    System.out.println("선택한 메뉴 : " + HamHamBurger.name + "|" + "w" + HamHamBurger.price + "|" + HamHamBurger.comment);
                    break;

                case 2:
                    System.out.println("선택한 메뉴 : " + ShackBurger.name + " | " + "w" + ShackBurger.price + " | " + ShackBurger.comment);
                    break;

                case 3:
                    System.out.println("선택한 메뉴 : " + BaconShack.name + " | " + "w " + BaconShack.price + " | " + BaconShack.comment);
                    break;

                case 4:
                    System.out.println("선택한 메뉴 : " + Cheeseburger.name + " | " + "w " + Cheeseburger.price + " | " + Cheeseburger.comment);
                    break;

                case 0:
                    System.out.println("선택한 메뉴 :" + HamHamBurger.name + " | " + "w " + HamHamBurger.price + " | " + HamHamBurger.comment);
                    break;

                default:
                    System.out.println("[error]올바른 값을 입력하세요.");

            }

            if (firstChoice == 0) {
                choice = true;
            }
        }
        scanner.close();
    }

}
