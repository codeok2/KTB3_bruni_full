import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrandSpecificInfo extends ShoesInfo{
    private int brandNo; // 브랜드 번호(어떤 브랜드인지 찾기 위함)
    private String[] selectedShoes; // 선택된 브랜드 신발을 담을 배열
    private String selectedBrand;
    private Map<String, String[]> shoesOfBrand; // e.g. <"나이키", {에어포스, 줌 플라이, ...}>

    public BrandSpecificInfo(int brandNo) {
        this.brandNo = brandNo;
        setSelectedBrand();
    }



    public int getBrandNo() {
        return brandNo;
    }

    /**
     * 에러 발생 : selectedBrand 변수 추가하고 리펙토링 시도 후
     * 해결: 생성자 안에서 메서드 호출하여 해결
     */
    public void setSelectedBrand() {
        this.selectedBrand = brands[brandNo - 1];
    }

    public String getSelectedBrand() {
        return this.selectedBrand;
    }



    /**
     * 자식 클래스를 위한 setter, 아직 작성 전이라 해야됨!!!
      */
    public void setShoesOfBrand(String selectedBrand) {
        shoesOfBrand = new HashMap<>();
        shoesOfBrand.put(selectedBrand, findBrandSpec(selectedBrand));
    }


    public String[] findBrandSpec(String brand) {
        if (brand.equals("나이키")) {
            return new String[]{"에어포스", "줌 플라이", "V2K Run", "Cortez", "Vomero"};
        } else if (brand.equals("아디다스")) {
            return new String[]{"아디제로 EVO", "Yeezy", "Samba", "Stan Smith", "Superstar"};
        } else if (brand.equals("퓨마")) {
            return new String[]{"Suede Classic", "Cali", "RS-X", "Future Rider", "Clyde"};
        } else if (brand.equals("뉴발란스")) {
            return new String[]{"NB-530", "NB-574", "NB-990", "NB-327", "NB-2002"};
        } else {
            return new String[]{"GEL-Kayano", "GEL-Nimbus", "GEL-Lyte", "GEL-Quantum", "Novablast"};
        }
    }

    // 파라미터 : 특정 브랜드의 특정 신발의 번호, OrderService 클래스에서 사용되는 메서드
    public String getSelectedShoes(int numOfShoes) {
        String brand = brands[brandNo - 1]; // 브랜드 번호로 브랜드 찾기
        selectedShoes = findBrandSpec(brand); // 특정된 브랜드의 배열 찾기
        return selectedShoes[numOfShoes - 1]; // 특정된 신발 반환
    }


    @Override
    public void show() {
        int i = 1;
        for(String shoes : findBrandSpec(selectedBrand)) {
            System.out.println(i + ". " + shoes);
            i++;
        }
    }


}
