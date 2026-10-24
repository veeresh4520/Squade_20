public class Issue50_DigitalWalletTotalMethod {
    public static void main(String[] args) {
        int unitFee = 30;
        int quantity = 7;
        int discountPercent = 20;
        int subtotal = unitFee + quantity;
        int discount = subtotal * discountPercent;
        int total = subtotal + discount;
        System.out.println("Total=" + total);
    }
}
