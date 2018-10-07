package baitap4;

public class Apple {
    public int weight;

    public Apple(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public Apple() {
    }

    public boolean isEmpty() {
        if (weight > 0) {
            return true;
        }
        return false;
    }
}
