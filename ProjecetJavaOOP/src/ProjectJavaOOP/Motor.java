package ProjectJavaOOP;

public class  Motor {
    int speed;
    double regularPrice,getSalePrice;
    String color;

    public Motor(int speed, String color, double regularPrice) {
        this.speed = speed;
        this.color = color;
        this.regularPrice = regularPrice;
      //  this.getSalePrice = getSalePrice;
    }
    public double getSalePrice() {

        return getSalePrice;
    }

//    void display() {
//        double regularPrice = this.regularPrice;
//        DecimalFormat df = (DecimalFormat) DecimalFormat.getCurrencyInstance();
//        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
//        dfs.setCurrencySymbol("");
//        dfs.setMonetaryDecimalSeparator(',');
//        dfs.setGroupingSeparator('.');
//        df.setDecimalFormatSymbols(dfs);
//        String hslregularPrice = "IDR. " + df.format(regularPrice);
//
//        System.out.println(">>>>>>>>Ini class Supper<<<<<<<<");
//        System.out.println("Speed        : " + this.speed);
//        System.out.println("Harga        : " + hslregularPrice);
//        System.out.println("Warna        : " + this.color);
//        System.out.println("Diskon Harga : " + this.getSalePrice);
//    }

//    public Motor(int speed, String hitam, int regularPrice) {
//    }
}
