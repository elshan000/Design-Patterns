package Factory;

public class Samsung extends Phone {
    private String model;
    private int price;

    public void setModel(String model){
        this.model = model;
    }

    public void setPrice(int price){
        this.price=price;
    }

    public String getModel(){
        return model;
    }

    public int getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return "Samsung"+
                "model - "+model + "price - "+price;

    }
}
