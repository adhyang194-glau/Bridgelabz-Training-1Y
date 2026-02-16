class DiscountCalculator{
 public static void main(String[] args){
 int fee = 125000;
 int discountpercent = 10;
 int discount = (fee * discountpercent) / 100;
 int discountprice = fee - discount;
 System.out.println("Original Fee " + fee);
 System.out.println("Discount Amount " + discount);
 System.out.println("Fee to be Paid After Discount " + discountprice);
 }
}