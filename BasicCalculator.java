        import java.util.Scanner;

        public class BasicCalculator {

            // Methods
            public static int add(int a, int b) {
                return a + b;
            }

            public static int subtract(int a, int b) {
                return a - b;
            }

            public static long multiply(int a, int b) {
                return (long) a * b;
            }

            public static double divide(int a, int b) {
                if (b == 0) {
                    System.out.println("❌ Cannot divide by zero!");
                    return 0.0;
                }
                return (double) a / b;
            }

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter first number: ");
                int x = sc.nextInt();
                System.out.print("Enter second number: ");
                int y = sc.nextInt();

                System.out.println("Addition: " + add(x, y));
                System.out.println("Subtraction: " + subtract(x, y));
                System.out.println("Multiplication: " + multiply(x, y));
                System.out.println("Division: " + divide(x, y));

                sc.close();
            }
        }

