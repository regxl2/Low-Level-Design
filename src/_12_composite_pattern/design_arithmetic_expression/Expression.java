package _12_composite_pattern.design_arithmetic_expression;

class Expression implements ArithmeticExpression {

    private final Operation operation;
    private final ArithmeticExpression leftExpression, rightExpression;

    Expression(Operation operation, ArithmeticExpression leftExpression, ArithmeticExpression rightExpression){
        this.operation = operation;
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int evaluate() {
        return switch (operation) {
            case ADD -> leftExpression.evaluate() + rightExpression.evaluate();
            case SUBTRACT -> leftExpression.evaluate() - rightExpression.evaluate();
            case MULTIPLY -> leftExpression.evaluate() * rightExpression.evaluate();
            case DIVISION -> leftExpression.evaluate() / rightExpression.evaluate();
        };
    }
}
