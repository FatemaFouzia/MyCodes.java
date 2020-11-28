import java.util.ArrayList;
import java.util.List;

public class ArrayProblm {
    public static void main(String[] args) {

       // int value = 7;

//        int[] values;
     // int values;
        List<Integer> values = new ArrayList<Integer>();
     //   System.out.println(values[0]);

       values.add(0,22);
       values.add(1,44);

        System.out.println(values.get(0));
//        System.out.println(values[1]);
//        System.out.println(values[2]);

        for(int i=1; i < values.size(); i++) {
            System.out.println(values);
        }

        int[] numbers = {5, 6, 7};

        for(int i=0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

}
