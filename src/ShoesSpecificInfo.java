import java.util.HashMap;
import java.util.Map;

public class ShoesSpecificInfo extends BrandSpecificInfo{
    private final int[] size = {240, 250, 260, 270, 280};
    private Map<String, Integer> priceOfShoes;

    // 생성자
    public ShoesSpecificInfo(int brandNo) {
        super(brandNo);
        setPriceOfShoes();
    }


    public int getPrice() {
        return priceOfShoes.get(getSelectedShoes(super.getBrandNo()));
    }

    public int getSelectedSize(int num) {
        return size[num-1];
    }
    // 신발의(특정 브랜드의 신발 하나) size와 price 출력하는 메서드
    @Override
    public void show() {
        for (int i = 0; i < brands.length; i++) {
            System.out.println(i+1 +". " + size[i]);
        }
    }

    // 신발 가격 초기화(임시)
    private void setPriceOfShoes() {
        priceOfShoes = new HashMap<>();
        int price = 80000; // 임시 가격 지정
        if (getSelectedBrand().equals("나이키")) {
            String[] brand = findBrandSpec("나이키");
            for (int i = 0; i < 5; i++) {
                priceOfShoes.put(brand[i], price);
                price += 5000;
            }
        } else if (getSelectedBrand().equals("아디다스")) {
            String[] brand = findBrandSpec("아디다스");
            for (int i = 0; i < 5; i++) {
                priceOfShoes.put(brand[i], price);
                price += 5000;
            }
        }else if (getSelectedBrand().equals("퓨마")) {
            String[] brand = findBrandSpec("퓨마");
            for (int i = 0; i < 5; i++) {
                priceOfShoes.put(brand[i], price);
                price += 5000;
            }
        }else if (getSelectedBrand().equals("뉴발란스")) {
            String[] brand = findBrandSpec("뉴발란스");
            for (int i = 0; i < 5; i++) {
                priceOfShoes.put(brand[i], price);
                price += 5000;
            }
        }else if (getSelectedBrand().equals("아식스")) {
            String[] brand = findBrandSpec("아식스");
            for (int i = 0; i < 5; i++) {
                priceOfShoes.put(brand[i], price);
                price += 5000;
            }
        }
    }
}
