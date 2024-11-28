package com.example.kiosk;

import java.util.InputMismatchException;
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
        boolean exit = false;

        do {
            try { //예외가 발생할 것 같은 코드
                System.out.println(" ");
                System.out.println("[ Main MENU ]"); //메인(카테고리) 메뉴 출력
                for (int i = 0; i < menus.size(); i++) {
                    System.out.println((i + 1) + ". " + menus.get(i).getCategoryName()); //i + 1은 인덱스값을 맞춰주기 위함/메뉴 번호와 카테고리 이름 출력
                }
                System.out.println("0. 종료");
                System.out.println("원하시는 카테고리 번호를 입력해주세요.");

                int choiceCategoryNumber = scanner.nextInt(); //메인메뉴 출력 후 유저에게 카테고리 번호 입력받기

                if (choiceCategoryNumber == 0) { //입력받은 값이 0일 경우, 프로그램 종료
                    System.out.println("프로그램을 종료합니다.");
                    exit = true;
                } else if (0 < choiceCategoryNumber && choiceCategoryNumber <= menus.size()) { //입력받은 값 범위 확인
                    //올바른 값을 입력했을 때
                    Menu selectMenu = menus.get(choiceCategoryNumber - 1);
                    choiceMenu(selectMenu, scanner); //특정 카테고리로 이동
                } else {
                    //조건범위에 맞지 않는 값을 입력받은 경우 출력
                    System.out.println("[error] 입력하신 번호의 메뉴가 존재하지 않습니다. 다시 입력해주세요.");
                }
            } catch (InputMismatchException e) { // 예외가 발생했을 때 실행할 코드
                //숫자가 아닌 값이 들어왔을 때 처리
                System.out.println("[error] 잘못된 입력입니다. 숫자를 입력해주세요.");
                scanner.nextLine(); //버퍼를 비워 남아있는 입력 제거
            }
        } while (!exit);

        scanner.close();
    }

    /**
     * 선택한 카테고리 메뉴룰 출력하고 유저 입력 처리
     *
     * @param menu    유저가 선택한 메뉴 카테고리
     * @param scanner 유저 입력을 처리하는 Scanner
     */
    private void choiceMenu(Menu menu, Scanner scanner) {
        boolean back = false; //카테고리 메뉴 선택 화면으로 돌아갈 지 여부를 결정해주는 플래그

        do {
            try {
                //선택한 카테고리 안의 메뉴 출력
                System.out.println(" ");
                System.out.println("[" + menu.getCategoryName() + "]");
                List<MenuItem> items = menu.getMenuItems();

                for (int i = 0; i < items.size(); i++) {
                    MenuItem item = items.get(i);
                    System.out.println((i + 1) + "." + item.getName() + " | W " + item.getPrice() + " | " + item.getComment());
                }
                System.out.println("0. 카테고리 선택메뉴로 돌아가기");
                System.out.println(" ");

                System.out.println("원하시는 메뉴의 번호를 입력해주세요.");

                int choiceMenuNumber = scanner.nextInt(); //메뉴 출력 후 유저에게 번호 입력받기

                if (choiceMenuNumber == 0) { //0 입력 시 카테고리 선택 화면으로 돌아가기
                    back = true;
                    System.out.println("카테고리 선택 화면으로 돌아갑니다.");
                } else if (0 < choiceMenuNumber && choiceMenuNumber <= items.size()) {
                    //올바른 값을 입력했을 때
                    MenuItem selectItem = items.get(choiceMenuNumber - 1);
                    System.out.println("[" + selectItem.getName() + " | W " + selectItem.getPrice() + " | W " + selectItem.getComment() + "]" + "를 선택하셨습니다.");
                    System.out.println(" ");
                } else {
                    //조건범위에 맞지 않는 값을 입력받은 경우 출력
                    System.out.println("[error] 입력하신 번호의 메뉴가 존재하지 않습니다. 다시 입력해주세요.");
                }
            } catch (InputMismatchException e) {
                //숫자가 아닌 값이 들어왔을 때 처리
                System.out.println("[error] 잘못된 입력입니다. 숫자를 입력해주세요.");
                scanner.nextLine(); //버퍼를 비워 남아있는 입력 제거
            }
        } while (!back);
    }

}
