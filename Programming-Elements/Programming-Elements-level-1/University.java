public class University {
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;
        double discount = (fee * discountPercent) / 100.0;
        double discountedFee = fee - discount;
        System.out.println("The discount amount is INR " + (int)discount);
        System.out.println("The final discounted fee is INR " + (int)discountedFee);
    }
}
