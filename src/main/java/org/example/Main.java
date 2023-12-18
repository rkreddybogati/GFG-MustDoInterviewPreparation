package org.example;

import org.example.arrays.*;
import org.example.math.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

            ///Math
            ASimpleFraction.run(args);
            FactorialTailingZerosCount.run();
            SmallestPositiveInteger.run();
            MissingNumberInArray.run();
            NthNaturalNumber.run();

            // Arrays
            EquilibriumPoint.run();
            LeadersInArray.run();
            RotateArray.run();
            PlusOne.run();
            ReArrange.run();
            LargeFactorials largeFactorials = new LargeFactorials();
            largeFactorials.run();
            FindZeros.run();
            LongestSusequentNumbers.run();

        }
}