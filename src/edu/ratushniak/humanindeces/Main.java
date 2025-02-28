package edu.ratushniak.humanindeces;

public class Main {

    public static void main(String[] args) {
        double weight = 80.0;
        double imb = 1.52;

        var bmiCalculator = new BMICalculator();
        var bmi = bmiCalculator.calculateBMI(weight, imb);
        var weightCategory = BMICalculator.bmiToWeightCategory(bmi);

        System.out.println(weightCategory);
    }
}
