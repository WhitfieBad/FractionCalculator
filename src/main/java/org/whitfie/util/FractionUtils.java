package org.whitfie.util;

import org.whitfie.exeption.FractionExeption;
import org.whitfie.model.Fraction;

import java.math.BigInteger;

public class FractionUtils {

   public static long gcd(long a,long b){
        return b == 0 ? a : gcd(b,a % b);
    }

    public static long lcm(long a,long b){
        return a / gcd(a,b) * b;
    }


    public static void leasCommonDenominator(Fraction o1, Fraction o2) throws FractionExeption {

        int lcm = (int) lcm(o1.getDenominator(), o2.getDenominator());


        int fractionGcd = lcm / o1.getDenominator();
        o1.setNumerator(o1.getAbsNumerator() * fractionGcd);
        o1.setDenominator(o1.getDenominator() * fractionGcd);

        fractionGcd = lcm / o2.getDenominator();
        o2.setNumerator(o2.getAbsNumerator() * fractionGcd);
        o2.setDenominator(o2.getDenominator() * fractionGcd);


    }

    public static void toOrdinaryFraction(Fraction fraction1, Fraction fraction2) throws FractionExeption {

        if (fraction1.getMixed() != 0) {
            fraction1.setNumerator((fraction1.getMixed() * fraction1.getDenominator()) + fraction1.getAbsNumerator());
            fraction1.setMixed(0);

        }


        if (fraction2.getMixed() != 0 ) {
            fraction2.setNumerator((fraction2.getMixed() * fraction2.getDenominator()) + fraction2.getAbsNumerator());
            fraction2.setMixed(0);
        }


    }

    public static void reduceFraction(Fraction fraction) throws FractionExeption {
        if (fraction.getDenominator() == 0 || fraction.getNumerator() == 0) {
            throw new FractionExeption();
        }

        if (fraction.getMixed() != 0) {
            throw new FractionExeption();
        }

        int gcd = (int) gcd(fraction.getAbsNumerator(), fraction.getDenominator());
        fraction.setNumerator(fraction.getAbsNumerator() / gcd);
        fraction.setDenominator(fraction.getDenominator() / gcd);
    }

    public static void toMixed(Fraction fraction) throws FractionExeption {
        if (fraction.isCorrectFraction() || fraction.getMixed() != 0) {
           return;
        }

        if (fraction.getDenominator() == 1) {
            fraction.setMixed(fraction.getAbsNumerator());
            fraction.setNumerator(0);
            fraction.setDenominator(0);
        } else {
            fraction.setMixed(fraction.getAbsNumerator() / fraction.getDenominator());
            fraction.setNumerator(fraction.getAbsNumerator() % fraction.getDenominator());
        }
    }




}
