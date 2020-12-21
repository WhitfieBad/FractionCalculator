package org.whitfie;

import org.whitfie.calculator.*;
import org.whitfie.exeption.FractionExeption;
import org.whitfie.model.Fraction;
import org.whitfie.model.ValueType;

public class FractionCalculator {

    public static void main(String[] args) throws FractionExeption, CloneNotSupportedException {
        Fraction fraction = new Fraction(0, 0, 3 ,ValueType.NEGATIVE);
        Fraction fraction1 = new Fraction(0, 0, 5,ValueType.POSITIVE);
        Calculate calculate = new Calculate(new Subtraction());
        System.out.println(calculate.calculate(fraction, fraction1));
    }
}
