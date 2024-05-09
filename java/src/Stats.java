public class Stats {
    
    int value;
    int modifier;

    public Stats(int value) {
        updateValue(value);
    }

    public void updateValue(int value) {
        this.value = value;
        this.modifier = mod(this.value);
    }

    public void addBonus(int bonus) {
        this.value += bonus;
        this.modifier = mod(this.value);
    }

    public int mod(int value) {
        return ((value - 10) / 2);
    }
}
