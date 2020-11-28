public class ArrayString {

        public static void main(String[] args) {

            // Declare array of (references to) strings.
            String[] words = new String[3];

            // Set the array elements (point the references
            // at strings)
            words[0] = "Hello";
            words[1] = "to";
            words[2] = "you";

            // Access an array element and print it.
            System.out.println(words[2]);

            // Simultaneously declare and initialize an array of strings
            String[] fruits = {"apple", "banana", "pear", "kiwi"};

            // Iterate through an array
            for(String fruit: fruits) {
                System.out.println(fruit);
            }
        }

    }



