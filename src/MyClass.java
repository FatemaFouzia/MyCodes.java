import java.util.ArrayList;

public class MyClass {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("fddfdf");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        cars.remove("BMW");
        System.out.println(cars);
        System.out.println(cars.size());

        for (String i: cars) {
            System.out.println(i);
        }
    }
}
