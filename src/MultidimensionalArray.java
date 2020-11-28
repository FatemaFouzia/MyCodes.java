public class MultidimensionalArray {
    public static void main(String[] args) {

        int[] value = {4,6,7};
        System.out.println(value[2]);

        int[][] number = {{10,20,30},{45,67,22},{44,66,55,66}};
        System.out.println(number[2][1]);

        String[][] text = new String[1][2];
        text[0][1] = "we are";

        System.out.println(text[0][1]);

        for (int row = 0; row < number.length; row++) {
            for (int col = 0; col < number[row].length; col++) {
                System.out.print(number[row][col] + "\t");

            }

          System.out.println();

        }

    }
}
