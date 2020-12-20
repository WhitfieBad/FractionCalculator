package org.whitfie.calculator;

import org.whitfie.exeption.FractionExeption;
import org.whitfie.model.Fraction;
import org.whitfie.model.ValueType;

public class Divide implements FractionCalculator {

    @Override
    public Fraction calculate(Fraction fraction1, Fraction fraction2) throws FractionExeption {
        int numerator = fraction1.getNumerator() * fraction2.getDenominator();
        int denominator = fraction1.getDenominator() * fraction2.getNumerator();
        return new Fraction(Math.abs(numerator), Math.abs(denominator), ValueType.getType(numerator));
    }
}
