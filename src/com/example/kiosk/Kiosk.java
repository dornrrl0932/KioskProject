package com.example.kiosk;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;


/**
 * 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리
 */
public class Kiosk {
    private List<Menu> menus;

    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int Choice;
        boolean exit = false;
        boolean back = false;

        do {
            System.out.println("[ Main MENU ]");
            for(int i = 0 ; i < menus.size();i++) {
                System.out.println((i + 1) + "." + menus.get(i).getCategoryName());
            }
            System.out.println("0. 종료");
            System.out.println(" ");
            System.out.println("원하시는 카테고리 번호를 입력해주세요.");

            int categoryNumber = scanner.nextInt();

            if(categoryNumber == 0) {
                System.out.println("프로그램을 종료합니다.");
                exit = true;
            } else if (0 < categoryNumber && categoryNumber >= menus.size()) {
                System.out.println(categoryNumber + "." + menus.get(categoryNumber).getCategoryName() + "를 선택하셨습니다.");
                System.out.println(" ");
            } else {
                System.out.println("입력하신 번호의 메뉴가 존재하지 않습니다. 다시 입력해주세요.");
            }
        } while (!exit);




        scanner.close();
    }
}
