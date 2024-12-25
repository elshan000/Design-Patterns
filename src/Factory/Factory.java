package Factory;

public class Factory {
    public static Phone getPhone(String model,int price){
        Phone phone;
        if("Iphone".equals(model)){
            phone = new Iphone();
        }
        else if("Samsung".equals(model)){
            phone = new Samsung();
        }
        else {
            System.out.println("Yanlis model");
        }

        return phone;
    }

}
