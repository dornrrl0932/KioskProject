package com.example.kiosk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstChoice;
        boolean choice = false;

        while (!choice) {
            System.out.println("[ Burger MENU ]");
            System.out.println("1. HamHamBurger     | W 4.5 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("2. ShackBurger      | W 5.5 | 토마토, 양상추, 쉑소스가 토핑된 버거");
            System.out.println("3. BaconShack       | W 5.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 버거");
            System.out.println("4. Cheeseburger     | W 5.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("0. 종료              |  종료  |");
            System.out.print("⇒ ");

            firstChoice = scanner.nextInt();

            switch (firstChoice) {

                case 1:
                    System.out.println("HamHamBurger 를 선택하셨습니다.");
                    break;

                case 2:
                    System.out.println("ShackBurger 를 선택하셨습니다.");
                    break;

                case 3:
                    System.out.println("BaconShack 를 선택하셨습니다.");
                    break;

                case 4:
                    System.out.println("Cheeseburger 를 선택하셨습니다.");
                    break;

                case 0:
                    System.out.println("프로그램을 종료합니다.");
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
