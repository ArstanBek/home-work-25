public class Pepperoni extends Pizza {
    private boolean isSpicy;
    public Pepperoni() {
    }

    public Pepperoni(String name, int price, int weight) {
        super(name, price, weight);
    }

    public Pepperoni(String name, int price, int weight, boolean isSpicy) {
        super(name, price, weight);
        this.isSpicy = isSpicy;
    }

    @Override
    public void cook() {
        System.out.println(this.getName() + " is cooking");
    };

    @Override
    public void delivery() {
        System.out.println(this);
        System.out.println(this.getName() + " is delivering");
    }

    @Override
    public String toString() {
        return
                "Name: " + this.getName() + "\n" +
                "Price: " + this.getPrice() + "\n" +
                "Weight: " + this.getWeight() + "\n" +
                "is spicy: " + (this.isSpicy() ? "yes" : "no");
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
    }
}
