package org.whitfie.model;


import org.whitfie.exeption.FractionExeption;

public class Fraction implements Cloneable {

    private int numerator;
    private int denominator;
    private int mixed;
    private ValueType valueType;


    public Fraction() {
    }

    public Fraction(int numerator, int denominator, ValueType valueType) throws FractionExeption {
        setNumerator(numerator);
        setDenominator(denominator);
        setValueType(valueType);
    }

    public Fraction(int numerator, int denominator, int mixed, ValueType valueType) throws FractionExeption {
        setNumerator(numerator);
        setDenominator(denominator);
        setMixed(mixed);
        setValueType(valueType);
    }

    public int getAbsNumerator() {
        return numerator;
    }

    public int getNumerator() {
        if (valueType == ValueType.NEGATIVE) {
            return 0 - numerator;
        }

        return numerator;
    }

    public void setNumerator(int numerator) throws FractionExeption {
        if (numerator < 0) {
            throw new FractionExeption();
        }

        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) throws FractionExeption {
        if (denominator < 0) {
            throw new FractionExeption();
        }

        this.denominator = denominator;
    }

    public int getMixed() {
        return mixed;
    }

    public void setMixed(int mixed) throws FractionExeption {
        if (mixed < 0) {
            throw new FractionExeption();
        }

        this.mixed = mixed;
    }

    public ValueType getValueType() {
        return valueType;
    }

    public void setValueType(ValueType valueType) {
        this.valueType = valueType;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Fraction fraction = new Fraction();
        fraction.valueType = this.valueType;
        fraction.numerator = this.numerator;
        fraction.denominator = this.denominator;
        fraction.mixed = this.mixed;
        return fraction;
    }

    @Override
    public String toString() {
        return mixed + "(" + numerator + "/" + denominator + ")";
    }

    public boolean isCorrectFraction() throws FractionExeption {
        if (denominator == 0 || numerator == 0) {
            throw new FractionExeption();
        }

        return numerator <= denominator;
    }
}
