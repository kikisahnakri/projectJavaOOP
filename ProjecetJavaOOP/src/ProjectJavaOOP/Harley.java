package ProjectJavaOOP;

public class Harley  extends  Motor{
    int weight;
    double discount;

    public Harley(int weight) {
        super(300,"Hitam",4000);
        this.weight = weight;
    }
    public double getSalePrice() {
        if (this.weight >= 2000) {
            return regularPrice * 0.1;
        } else {
            return regularPrice * 0.2;
        }
    }

    public double totalHarga() {
        return regularPrice - getSalePrice();
    }
    void display() {
        System.out.println("Weight               : " + this.weight);
        System.out.println("Regular Price        : "+"Rp."+ this.regularPrice);
        System.out.println("Discount             : "+"Rp."+ this.getSalePrice());
        System.out.println("Final Price          : "+"Rp."+ (regularPrice-this.getSalePrice()));
        System.out.println("Color                : " + super.color);
        System.out.println("Speed                : " + super.speed);
    }

//    public Harley(int weight,double getSalePrice,double discount) {
//        this.weight = weight;
//        this.getSalePrice= getSalePrice;
//        this.discount = discount;
//        if (this.weight>=2000){
//            this.getSalePrice=this.discount*0.1;
//        }else{
//            this.getSalePrice=this.discount*0.2;
//        }
//        //variable = (condition) ? expressionTrue :  expressionFalse;
//       // double getSalePrice = (this.weight>=2000)? (discount = (getSalePrice * 0.1):(discount = getSalePrice * 0.2));
//
//    }
}
