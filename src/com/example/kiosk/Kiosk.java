package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리
 */
public class Kiosk {
    private List<MenuItem> menuItems;

    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }


    public void start () {

        Scanner scanner = new Scanner(System.in);

        int firstChoice;
        boolean choice = false;

        do {
            System.out.println("[ Burger MENU ]");
            System.out.println("1. HamHamBurger     | W 4.5 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("2. ShackBurger      | W 5.5 | 토마토, 양상추, 쉑소스가 토핑된 버거");
            System.out.println("3. BaconShack       | W 5.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 버거");
            System.out.println("4. Cheeseburger     | W 5.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("0. 종료              |  종료  |");
            System.out.println(" ");
            System.out.print("원하시는 메뉴의 번호를 입력해주세요.(종료를 원하실 경우 '0'을 입력해주세요) : ");

            firstChoice = scanner.nextInt();

            switch (firstChoice) {

                case 1:
                    System.out.println(menuItems.get(0).name + " | " + " W " + menuItems.get(0).price + " | " + menuItems.get(0).comment + "를 선택하셨습니다.");
                    break;

                case 2:
                    System.out.println(menuItems.get(1).name + " | " + " W " + menuItems.get(1).price + " | " + menuItems.get(1).comment + "를 선택하셨습니다.");
                    break;

                case 3:
                    System.out.println(menuItems.get(2).name + " | " + " W " + menuItems.get(2).price + " | " + menuItems.get(2).comment + "를 선택하셨습니다.");
                    break;

                case 4:
                    System.out.println(menuItems.get(3).name + " | " + " W " + menuItems.get(3).price + " | " + menuItems.get(3).comment + "를 선택하셨습니다.");
                    break;

                case 0:
                    System.out.println(menuItems.get(4).name + " | " + " W " + menuItems.get(4).price + " | " + menuItems.get(4).comment + "를 선택하셨습니다.");
                    break;

                default:
                    System.out.println("해당하는 번호의 메뉴가 없습니다. 다시 입력해주세요.");

            }

            if (firstChoice == 0) {
                choice = true;
            }
        }while (!choice);

        scanner.close();
    }
}
