        import java.util.Scanner;

        public class Practice {

            public static void main(String[] arr) {
                // Printing from 1 - 10 using For and While loop

                for (int i = 0; i <= 10;) {
                    System.out.println(i);
                    i++;
                }

                int i = 0;
                while (i <= 10) {
                    System.out.println(i);
                    i++;
                }

                // Printing any number thats greater than zero till user gives negative number
                // input and Summing all User given Integer Data By using both For and While
                // loop

                // Using For-Loop
                Scanner sc = new Scanner(System.in);
                int sum = 0;
                for (int j = 0; j >= 0; j++) {
                    System.out.println("Enter any positive no: ");
                    j = sc.nextInt();
                    sum = sum + j;
                }

                System.out.println("Here is All your Added Numbers: " + sum);

                // Using While-loop
                int k = 0;
                int sum_1 = 0;
                while (k >= 0) {
                    System.out.println("Enter any positive no: ");
                    k = sc.nextInt();
                    sum_1 = sum_1 + k;
                }
                System.out.println("Here is All your Added Numbers: " + sum_1);

                sc.close();
   }

}
