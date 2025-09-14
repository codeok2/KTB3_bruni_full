public class ShoesInfo {
    final String brands[] = {"나이키", "아디다스", "퓨마", "뉴발란스", "아식스"};

    public void show() {
        for (int i = 0; i < brands.length; i++) {
            System.out.println(i+1 +". " + brands[i]);
        }
    }

    public String getBrand(int n) {
        return brands[n-1];
    }
}
