import java.util.Comparator;

public class SpeedComparator implements Comparator<Car> {
    public int compare(Car h1, Car h2) {
        if (h1.maxSpeed == h2.maxSpeed) {
            return 0;
        }
        if (h1.maxSpeed > h2.maxSpeed) {
            return 1;
        }
        else {
            return -1;
        }
    }
}

