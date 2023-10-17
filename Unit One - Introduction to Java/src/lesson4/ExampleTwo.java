package lesson4;

public class ExampleTwo {
    public static void main(String[] args) {
        //int x = 6.7;  //cannot assign a double into an int variable

        int x = (int) 6.7;  // double --> int is a narrowing cast conversion
                            // int --> double is a widening cast conversion

        System.out.println(x);
    }
}
