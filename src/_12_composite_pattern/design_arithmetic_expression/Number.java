package _12_composite_pattern.design_arithmetic_expression;

class Number implements ArithmeticExpression{
    private final int value;

    Number(int value){
        this.value = value;
    }

    @Override
    public int evaluate() {
        return this.value;
    }
}
