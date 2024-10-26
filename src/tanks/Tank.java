package tanks;

import java.util.Objects;

public class Tank {
    private String brand;
    private String model;
    private int weight;
    private int barrelCaliber;
    private int armor;

    public Tank(String brand, String model, int weight, int barrelCaliber, int armor) {
        this.brand = brand;
        this.model = model;
        this.weight = weight;
        this.barrelCaliber = barrelCaliber;
        this.armor = armor;
    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getBarrelCaliber() {
        return barrelCaliber;
    }

    public void setBarrelCaliber(int barrelCaliber) {
        this.barrelCaliber = barrelCaliber;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public String toString() {
        return String.format("Brand: %s, Model: %s, Weight: %dkg, Barrel caliber: %dmm, Armor: %dmm",
                brand, model, weight, barrelCaliber, armor);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tank)) return false;
        Tank tank = (Tank) o;
        return brand.equals(tank.brand) && model.equals(tank.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }
}