import java.util.Comparator;

public class Car implements Comparable<Car> {
    private int manufactureYear;
    private String model;
    public int maxSpeed;

    public Car(int manufactureYear, String model, int maxSpeed) {
        this.manufactureYear = manufactureYear;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int compareTo(Car o) {
        return this.getManufactureYear() - o.getManufactureYear();
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufactureYear=" + manufactureYear +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed+
                '}';
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}


