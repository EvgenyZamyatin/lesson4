package ru.ifmo.md.lesson4.Parser;

import ru.ifmo.md.lesson4.CalculationEngine.CalculationException;

/**
 * Created by Женя on 03.10.2014.
 */
public class Add extends BinaryOperation {
    public Add(Expression a, Expression b) {
        super(a, b);
    }
    @Override
    public double operation(double a, double b) throws CalculationException{
        double ans = a + b;
        if (Double.isInfinite(ans))
            throw new CalculationException();
        return a + b;
    }
}
