import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Car car1 = new Car(1990, "Ferrari", 310);
        Car car2 = new Car(2012, "Lamborghini", 290);
        Car car3 = new Car(2002, "Lada", 350);
        Car car4 = new Car(2000, "Shevrole", 400);
        Car car5 = new Car(2003, "BMV", 360);
        Car car6 = new Car(2004, "Citroen", 370);
        Car car7 = new Car(2011, "Moskvich", 380);
        Car car8 = new Car(2012, "Volga", 330);
        Car car9 = new Car(2020, "VAZ", 320);
        Car car10 = new Car(1999, "Toyota", 390);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);

        Iterator<Car> iter = cars.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        Collections.sort(cars);
        System.out.println("Sorted 1: ");
        for (Car h : cars) {
            System.out.println(h);
        }

        SpeedComparator speedComparator = new SpeedComparator();
        cars.sort(speedComparator);
        System.out.println("Sorted 2: ");
        for (Car h : cars) {
            System.out.println(h);
        }
    }
}
