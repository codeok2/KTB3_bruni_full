public class ShoppingCart {
    private String brand;
    private String shoesName;
    private int size;
    private int price;

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setShoesName(String shoesName) {
        this.shoesName = shoesName;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public String getShoesName() {
        return shoesName;
    }

    public int getSize() {
        return size;
    }

    public void printAllInfo() {
        System.out.println("[선택하신 신발은 <" + getBrand() + " " + getShoesName()
        +" " + getSize() + "사이즈>" + " 입니다.]");
        System.out.println("[가격은 : " + getPrice() + " 입니다.]");
    }

    public boolean isCorrectMoney (int money) {
        if (money == getPrice()) return true;
        else return false;
    }
}
