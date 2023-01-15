package ProjectJavaOOP;

public class Yamaha extends Motor{
    int cubicalCentimeter;
    double getSalePrice;

    public Yamaha(int cubicalCentimeter) {
        super(150,"Merah",1000);
        this.cubicalCentimeter = cubicalCentimeter;
    }

    public double getSalePrice() {
        if (this.cubicalCentimeter >= 250) {
            return regularPrice * 0.15;
        } else {
            return regularPrice * 0.10;
        }
    }
    void displayYamaha() {
        System.out.println("Cubical Centimeter   : " + this.cubicalCentimeter);
        System.out.println("Regular Price        : "+"Rp."+ this.regularPrice);
        System.out.println("Discount             : "+"Rp."+ this.getSalePrice());
        System.out.println("Final Price          : "+"Rp."+ (regularPrice-this.getSalePrice()));
        System.out.println("Color                : " + super.color);
        System.out.println("Speed                : " + super.speed);
    }
    //    public int Yamaha(int cubicalCentimeter, double getSalePrice) {
//        this.cubicalCentimeter = cubicalCentimeter;
//        this.getSalePrice = getSalePrice;
//            if (this.cubicalCentimeter>=250){
//                this.discount=this.discount*0.15;
//            }else{
//                this.discount=this.discount*0.20;
//            }
//        return cubicalCentimeter;
//    }
}
