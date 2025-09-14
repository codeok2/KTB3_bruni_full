public class OrderService {
    Input input = new Input();
    ShoesInfo shoesInfo = new ShoesInfo();
    ShoppingCart shoppingCart = new ShoppingCart();
    public void start() {
        int userInput = 0;
        while (true) {
            System.out.println("<<신발 구매 사이트에 오신걸 환영합니다!>>");
            System.out.println("[다음은 신발 브랜드 종류입니다.]");
            // 신발 브랜드 출력
            shoesInfo.show();
            System.out.print("구매할 신발 브랜드 번호를 입력해주세요 : ");
            userInput = input.getInput(); // 브랜드 번호
            shoppingCart.setBrand(shoesInfo.getBrand(userInput)); // 쇼핑카트에 신발 브랜드 담기

            System.out.println("\n================================");

            System.out.println("[" + shoppingCart.getBrand() + " 신발 종류]");
            BrandSpecificInfo brandSpecificInfo = new BrandSpecificInfo(userInput); // 브랜드 번호를 파라미터로 전달하여 객체 생성
            brandSpecificInfo.show();
            System.out.print("구매할 신발의 번호를 입력해주세요 : ");
            userInput = input.getInput(); // 브랜드의 구체적인 신발 번호
            shoppingCart.setShoesName(brandSpecificInfo.getSelectedShoes(userInput)); // 쇼핑카트에 신발 이름 담기

            System.out.println("\n================================");

            System.out.println("[" + shoppingCart.getShoesName() + " 사이즈]");
            ShoesSpecificInfo shoesSpecificInfo = new ShoesSpecificInfo(brandSpecificInfo.getBrandNo());
            shoesSpecificInfo.show();
            System.out.print("사이즈를 선택해주세요 : ");
            userInput = input.getInput(); // 선택한 사이즈 번호
            System.out.println("\n================================");
            shoppingCart.setSize(shoesSpecificInfo.getSelectedSize(userInput)); // 쇼핑 카트 사이즈 초기화
            shoppingCart.setPrice(shoesSpecificInfo.getPrice());

            shoppingCart.printAllInfo();
            System.out.println("구매를 원하시면 돈을 입력해주세요.");
            System.out.println("구매를 원하시지 않으면 숫자(0)을 입력해주세요.");

            while (true) {
                System.out.print("금액 투입 : ");
                userInput = input.getInput();
                if (userInput == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }

                if (shoppingCart.isCorrectMoney(userInput)) {
                    System.out.println("구입해주셔서 감사합니다 다음에 또 뵙겠습니다.");
                    break;
                } else {
                    System.out.println("금액을 잘못 입력하셨습니다. 다시 입력해주세요.");
                }
            }

            break;
        }
    }
}
