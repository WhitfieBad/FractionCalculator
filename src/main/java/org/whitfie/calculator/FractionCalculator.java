package org.whitfie.calculator;

import org.whitfie.exeption.FractionExeption;
import org.whitfie.model.Fraction;

public interface FractionCalculator {
    Fraction calculate(Fraction fraction1, Fraction fraction2) throws FractionExeption;
}
