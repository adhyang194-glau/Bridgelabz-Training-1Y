public class ProfitLossCalculator {
    public static void main(String[] args) {
        
        double costPrice = 129;
        double sellingPrice = 191;

        
        double amount;
        double percentage;

        if (sellingPrice > costPrice) {
            
            amount = sellingPrice - costPrice;
            percentage = (amount / costPrice) * 100;
            System.out.println("Profit: " + amount);
            System.out.println("Profit Percentage: " + percentage + "%");
        } else if (sellingPrice < costPrice) {
            
            amount = costPrice - sellingPrice;
            percentage = (amount / costPrice) * 100;
            System.out.println("Loss: " + amount);
            System.out.println("Loss Percentage: " + percentage + "%");
        } else {
            
            System.out.println("No Profit, No Loss.");
        }
    }
}