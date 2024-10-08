import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rating = 0;
        double credit = 0;

        for (int i = 0; i < 20; i++) {
            String s = sc.next();
            double score = sc.nextDouble();
            String grade = sc.next();
            double sum = 0;

            switch (grade) {
                case "A+" :
                    sum = 4.5;
                    break;
                case "A0" :
                    sum = 4.0;
                    break;
                case "B+" :
                    sum = 3.5;
                    break;
                case "B0" :
                    sum = 3.0;
                    break;
                case "C+" :
                    sum = 2.5;
                    break;
                case "C0" :
                    sum = 2.0;
                    break;
                case "D+" :
                    sum = 1.5;
                    break;
                case "D0" :
                    sum = 1.0;
                    break;
                case "F" :
                    sum = 0.0;
                    break;
            }

            if (!grade.equals("P")) {
                rating += score;
                credit += score * sum;
            }
        }

        System.out.println(credit / rating);
    }
}