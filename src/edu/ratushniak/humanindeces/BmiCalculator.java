package edu.ratushniak.humanindeces;

class BmiCalculator {
    public static String bmiToWeightCategory(double bmi) {
        if (bmi < 18.5) {
            return "Deficit";
        }
        if (bmi >= 18.5 && bmi < 25) {
            return "Norm";
        }
        if (bmi >= 25 && bmi < 30) {
            return "Warning!";
        }
        return "Fat";
    }

    public double calculateBmi(double weight, double height) {
        return weight / (height * height);
    }
}
