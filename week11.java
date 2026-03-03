public class week11{

    public static void main(String[] args) {

        // Step 1: Original fee
        double fee = 125000;

        // Step 2: Discount percentage
        double discountPercent = 10;

        // Step 3: Calculate discount amount
        double discount = (fee * discountPercent) / 100;

        // Step 4: Calculate final fee to pay
        double finalAmount = fee - discount;

        // Output
        System.out.println("Original Fee: INR " + fee);
        System.out.println("Discount Amount: INR " + discount);
        System.out.println("Final Fee to Pay: INR " + finalAmount);
    }
}