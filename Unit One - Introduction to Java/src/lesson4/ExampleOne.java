package lesson4;

public class ExampleOne {
    public static void main(String[] args) {
        int mark1 = 80, mark2 = 83, mark3 = 96;
        int numTests = 3;

        double average = (mark1 + mark2 + mark3) / (double)numTests; //works
        double average2 = ((double)mark1 + mark2 + mark3) / numTests; //works
        double average3 = (double)((mark1 + mark2 + mark3) / numTests); //doesnt work

        System.out.println(average);
        System.out.println(average2);
        System.out.println(average3);
    }
}
