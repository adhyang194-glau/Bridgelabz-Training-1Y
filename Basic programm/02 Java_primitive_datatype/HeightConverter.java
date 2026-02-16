public class HeightConverter {
    public static void main(String[] args) {
        double heightCm = 170.0;

        
        double cmPerInch = 2.54;
        double inchesPerFoot = 12;

        
        double totalInches = heightCm / cmPerInch;

       
        int feet = (int) (totalInches / inchesPerFoot);
        int inches = (int) (totalInches % inchesPerFoot);

        System.out.println("Height in cm: " + heightCm);
        System.out.println("Converted: " + feet + " feet " + inches + " inches");
    }
}