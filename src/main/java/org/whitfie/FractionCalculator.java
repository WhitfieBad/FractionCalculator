package org.whitfie;

import org.whitfie.calculator.*;
import org.whitfie.exeption.FractionExeption;
import org.whitfie.model.Fraction;
import org.whitfie.model.ValueType;

public class FractionCalculator {

    public static void main(String[] args) throws FractionExeption, CloneNotSupportedException {
        Fraction fraction = new Fraction(10, 10 , ValueType.NEGATIVE);
        Fraction fraction1 = new Fraction(15, 37, ValueType.NEGATIVE);
        Calculate calculate = new Calculate(new Divide());
        System.out.println(calculate.calculate(fraction, fraction1));
    }
}
