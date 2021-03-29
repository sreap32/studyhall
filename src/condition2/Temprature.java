package condition2;

public class Temprature {
    public static void main(String[] args) {

        /***
         *
         *
         *
         Finish the code to print It is freezing if temperature is below 30,
         It is cold if it is below,
         It is nice out if it is below 90, or It is hot,
         *
         *
         * ***/
        int temp = 50;

        if (temp < 30) {
            System.out.println("Freeze");
        } else if (temp < 50 || temp ==50) {
            System.out.println("Cold");
        } else if (temp < 90 || temp==90) {
            System.out.println("Nice");

        } else {
            System.out.println("Hot");
        }
    }
}
