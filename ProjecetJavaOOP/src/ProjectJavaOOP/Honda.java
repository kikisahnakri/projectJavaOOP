package ProjectJavaOOP;

public class Honda  extends  Motor{
    int year,manufacturerDiscount;

//    public Honda(int year,int manufacturerDiscount) {
//        this.year = year;
//        this.manufacturerDiscount = manufacturerDiscount;
//    }

    public Honda(int year, int manufacturerDiscount) {
        super(110, "Biru", 1000);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }
    public double getSalePrice() {
        return regularPrice - manufacturerDiscount;
    }

    void display() {
        System.out.println("Years                : " + this.year);
        System.out.println("Manufacturer         : " + this.manufacturerDiscount);
        System.out.println("Regular Price        : "+"Rp."+ super.regularPrice);
        System.out.println("Discount             : "+"Rp."+ this.manufacturerDiscount);
        System.out.println("Final Price          : "+"Rp."+ this.getSalePrice());
        System.out.println("Color                : " + super.color);
        System.out.println("Speed                : " + super.speed);
    }
}
