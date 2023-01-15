package ProjectJavaOOP;



public class CilsyAutoShop {
    public static void main(String[] args) {

        Yamaha yamahaJupiter = new Yamaha(1000);
        System.out.println("");
        System.out.println("====YAMAHA MOTOR INDONESIA====");
        yamahaJupiter.displayYamaha();

        Honda hondaBeat = new Honda (2002,120);
        System.out.println("");
        System.out.println("====HONDA MOTOR INDONESIA====");
        hondaBeat.display();

        Harley harleyStreet = new Harley (2243);
        System.out.println("");
        System.out.println("====HARLEY MOTOR INDONESIA====");
        harleyStreet.display();


    }
}
