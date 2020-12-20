package org.whitfie.calculator;

import org.whitfie.exeption.FractionExeption;
import org.whitfie.model.Fraction;
import org.whitfie.model.ValueType;

public class Multiplication implements FractionCalculator {

    @Override
    public Fraction calculate(Fraction fraction1, Fraction fraction2) throws FractionExeption {
        int numerator = fraction1.getNumerator() * fraction2.getNumerator();
        int denominator = fraction1.getDenominator() * fraction2.getDenominator();
        return new Fraction(Math.abs(numerator), denominator, ValueType.getType(numerator));
    }
}
