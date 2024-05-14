public class Stats {
    
    int base_value;
    int bonus = 0;
    int final_value;
    int modifier = 0;

    String name;

    public Stats(String name, int value) {
        this.name = name;
        this.base_value = value;
        this.final_value = value;
        this.modifier = mod(value);
    }

    public void updateValue() {
        this.final_value = base_value + bonus;
        this.modifier = mod(this.final_value);
    }

    public void setValue(int value) {
        this.base_value = value;
        updateValue();
    }

    public void addBonus(int bonus) {
        this.bonus += bonus;
        updateValue();
    }

    public int mod(int value) {
        return ((value - 10) / 2);
    }
}
