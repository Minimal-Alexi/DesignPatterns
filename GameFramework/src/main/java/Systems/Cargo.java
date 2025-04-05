package Systems;

public class Cargo {
    private final String name;
    private final float priceFallOff;
    private float price;
    public Cargo(String name, float priceFallOff, float price) {
        this.name = name;
        this.priceFallOff = priceFallOff;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public float getPriceFallOff() {
        return priceFallOff;
    }
    public float getPrice() {
        return price;
    }
    public void priceDropOff(){
        if(this.price > this.priceFallOff){
            this.price -= priceFallOff;
        }
    }
}
