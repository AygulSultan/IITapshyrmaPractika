public class Flower {
    private String counterOfGrow;
    private String shelfLife;
    private String expear;
    private boolean solt;
    private int price;
    public static int counter;
    public static int counterPrice;


    public Flower(String counterOfGrow, String shelfLife, String expear, boolean solt, int price) {
        this.counterOfGrow = counterOfGrow;
        this.shelfLife = shelfLife;
        this.expear = expear;
        this.solt = solt;
        this.price = price;
    }

    public String getCounterOfGrow() {
        return counterOfGrow;
    }

    public void setCounterOfGrow(String counterOfGrow) {
        this.counterOfGrow = counterOfGrow;
    }

    public String getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(String shelfLife) {
        this.shelfLife = shelfLife;
    }

    public String getExpear() {
        return expear;
    }

    public void setExpear(String expear) {
        this.expear = expear;
    }

    public boolean isSolt( ) {
        return solt;
    }

    public void setSolt(boolean solt) {
        this.solt = solt;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
