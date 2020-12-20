package org.whitfie.calculator;



import org.whitfie.exeption.FractionExeption;
import org.whitfie.model.Fraction;
import org.whitfie.model.ValueType;
import org.whitfie.util.FractionUtils;

public class Adding implements FractionCalculator {


    @Override
    public Fraction calculate(Fraction fraction1, Fraction fraction2) throws FractionExeption {
        FractionUtils.leasCommonDenominator(fraction1, fraction2);
        int numerator = fraction1.getNumerator() + fraction2.getNumerator();
        return new Fraction(Math.abs(numerator), fraction1.getDenominator(), ValueType.getType(numerator));
    }
}
