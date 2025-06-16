package java_programming_elements;

public class DiscountedFee {

	public static void main(String[] args) {
		double fixedFee = 125000;
        double fixedDiscountPercent = 10;
        double fixedDiscount = fixedFee * fixedDiscountPercent / 100;
        double fixedFinalFee = fixedFee - fixedDiscount;
        System.out.println("The discount amount is INR " + fixedDiscount + " and final discounted fee is INR " + fixedFinalFee);

	}

}
