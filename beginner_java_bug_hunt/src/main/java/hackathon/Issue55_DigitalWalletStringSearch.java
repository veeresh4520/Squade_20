public class Issue55_DigitalWalletStringSearch {
    public static void main(String[] args) {
        String[] ids = new String[] {"A20", "B20", "C20"};
        String target = new String("B20");
        int found = 0;
        for (int i = 1; i < ids.length - 1; i++) { if (ids[i] == target) found = i; else found = i - 1; }
        System.out.println("Index=" + found);
    }
}
