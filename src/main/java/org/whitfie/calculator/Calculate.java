package org.whitfie.calculator;

import org.whitfie.exeption.FractionExeption;
import org.whitfie.model.Fraction;
import org.whitfie.util.FractionUtils;

public class Calculate {

    private FractionCalculator calculator;

    public Calculate(FractionCalculator calculator) {
        this.calculator = calculator;
    }

    public Fraction calculate(Fraction fraction1, Fraction fraction2) throws FractionExeption, CloneNotSupportedException {
        Fraction o1 = (Fraction) fraction1.clone();
        Fraction o2 = (Fraction) fraction2.clone();

        FractionUtils.toOrdinaryFraction(o1, o2);

        Fraction result = calculator.calculate(o1, o2);

        FractionUtils.reduceFraction(result);
        FractionUtils.toMixed(result);

        return result;

    }
}
