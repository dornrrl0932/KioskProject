package com.example.kiosk;
import java.util.List;
import java.util.Scanner;
/**
 * 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리
 */
public class Kiosk {
    private List<Menu> menus;

    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    private List<Menu> getMenus() {
        return menus;
    }

    private void setMenus(List<Menu> menus) {
        this.menus = menus;
    }


    public void start() {
        Scanner scanner = new Scanner(System.in);
        int Choice;
        boolean exit = false;

        do {
            System.out.println(" ");
            System.out.println("[ Main MENU ]");
            for(int i = 0 ; i < menus.size();i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getCategoryName());
            }
            System.out.println("0. 종료");
            System.out.println("원하시는 카테고리 번호를 입력해주세요.");

            int choiceCategoryNumber = scanner.nextInt();

            if(choiceCategoryNumber == 0) {
                System.out.println("프로그램을 종료합니다.");
                exit = true;
            } else if (0 < choiceCategoryNumber && choiceCategoryNumber <= menus.size()) {
                Menu selectMenu = menus.get(choiceCategoryNumber - 1);
                choiceMenu(selectMenu,scanner);
            } else {
                System.out.println("입력하신 번호의 메뉴가 존재하지 않습니다. 다시 입력해주세요.");
            }

        } while (!exit);

        scanner.close();
    }

    private void choiceMenu(Menu menu, Scanner scanner) {
        boolean back = false;

        do {
            System.out.println(" ");
            System.out.println("[" + menu.getCategoryName() +"]");
            List<MenuItem> items = menu.getMenuItems();

            for (int i = 0 ; i < items.size() ; i++) {
                MenuItem item = items.get(i);
                System.out.println((i + 1) + "." + item.getName() + " | W " + item.getPrice() + " | " + item.getComment());
            }
            System.out.println("0. 카테고리 선택메뉴로 돌아가기");
            System.out.println(" ");

            System.out.println("원하시는 메뉴의 번호를 입력해주세요.");

            int choiceMenuNumber = scanner.nextInt();

            if(choiceMenuNumber == 0) {
                back = true;
                System.out.println("카테고리 선택 화면으로 돌아갑니다.");
            } else if (0 < choiceMenuNumber && choiceMenuNumber <= items.size()) {
                MenuItem selectItem = items.get(choiceMenuNumber - 1);
                System.out.println("[" + selectItem.getName() + " | W " + selectItem.getPrice() + " | W " + selectItem.getComment()+ "]" + "를 선택하셨습니다.");
                System.out.println(" ");
            } else {
                System.out.println("입력하신 번호의 메뉴가 존재하지 않습니다. 다시 입력해주세요.");
            }
        } while (!back);
    }

}
