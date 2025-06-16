package java_programming_elements;

public class Profit {

	public static void main(String[] args) {
		 int costPrice = 129, sellingPrice = 191;
         int profit = sellingPrice - costPrice;
         double profitPercent = (profit * 100.0) / costPrice;
         System.out.println("The Cost Price is INR " + costPrice + " and the Selling Price is INR " + sellingPrice);
         System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);


	}

}
