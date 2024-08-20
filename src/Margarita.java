public class Margarita extends Pizza {
    private boolean withMeat;
    public Margarita() {
    }

    public Margarita(String name, int price, int weight) {
        super(name, price, weight);
    }

    public Margarita(String name, int price, int weight, boolean withMeat) {
        super(name, price, weight);
        this.withMeat = withMeat;
    }

    @Override
    public void delivery() {
        System.out.println(this);
        System.out.println(this.getName() + " is delivering");
    }

    @Override
    public void cook() {
        System.out.println(this.getName() + " is cooking");
    };

    @Override
    public String toString() {
        return
                "Name: " + this.getName() + "\n" +
                        "Price: " + this.getPrice() + "\n" +
                        "Weight: " + this.getWeight() + "\n" +
                        "is with meat: " + (this.isWithMeat() ? "yes" : "no");
    }

    public boolean isWithMeat() {
        return withMeat;
    }

    public void setWithMeat(boolean withMeat) {
        this.withMeat = withMeat;
    }
}
