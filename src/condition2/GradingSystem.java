package condition2;

public class GradingSystem {
    public static void main(String[] args) {


        /**
         * 8*A school has foolowing rules for grading system:
         * a.below 25-f
         * b 25 to 45 -e
         * c 45 to 50 -d
         * 50 to 60 -c
         * 60 to 80 - b
         * above 80 a
         *
         */


        int grade = 35;

        if (grade < 25) {
            System.out.println("F");
        } else if (grade > 25 && grade < 45) {
            System.out.println("E");
        } else if (grade > 45 && grade < 50) {
            System.out.println("D");
        } else if (grade > 50 && grade < 60) {
            System.out.println("C");
        } else if (grade > 60 && grade < 80) {
            System.out.println("B");
        } else {
            System.out.println("A");


        }
    }
}
