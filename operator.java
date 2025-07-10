public class OperatorPrecedenceDemo {
    public static void main(String[] args) {
        // Example 1: Multiplication has higher precedence than addition
        int result1 = 10 + 5 * 2; // Evaluates as 10 + (5 * 2) = 10 + 10 = 20
        System.out.println("Result 1 (10 + 5 * 2): " + result1);

        // Example 2: Division and multiplication have equal precedence, evaluated left-to-right
        int result2 = 12 / 2 * 3; // Evaluates as (12 / 2) * 3 = 6 * 3 = 18
        System.out.println("Result 2 (12 / 2 * 3): " + result2);

        // Example 3: Parentheses override default precedence
        int result3 = (10 + 5) * 2; // Evaluates as (15) * 2 = 30
        System.out.println("Result 3 ((10 + 5) * 2): " + result3);

        // Example 4: Mixed operators and associativity
        int a = 5;
        int b = 3;
        int c = 2;
        int result4 = a + b * c - (a / c); // Evaluates as 5 + (3 * 2) - (5 / 2) = 5 + 6 - 2 = 9
        System.out.println("Result 4 (a + b * c - (a / c)): " + result4);
    }
}