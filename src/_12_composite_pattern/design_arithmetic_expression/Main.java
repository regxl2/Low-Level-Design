package _12_composite_pattern.design_arithmetic_expression;

public class Main {
    public static void main(String[] args) {
        // Arithmetic Expression:-  1 + ( ( 2 * 4 ) / 3 )
        Number two = new Number(2);
        Number four = new Number(4);
        Expression expression1 = new Expression(Operation.MULTIPLY, two, four);
        Number three = new Number(3);
        Expression expression2 = new Expression(Operation.DIVISION, expression1, three);
        Number one = new Number(1);
        Expression expression3 = new Expression(Operation.ADD, one, expression2);
        System.out.println(expression3.evaluate());
    }
}
