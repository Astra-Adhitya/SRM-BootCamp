public class Question4 {
    public static void main(String[] args){
        int CostPrice = 129;
        int SellingPrice = 191;
        int profit = SellingPrice - CostPrice;
        double profitPercentage = (double) profit / CostPrice * 100;
        System.out.println("The Cost Price is INR " + CostPrice + " and Selling Price is INR " + SellingPrice);
        System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%");
    }
}
