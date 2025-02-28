package edu.ratushniak.humanindeces;

public class Main {

    public static void main(String[] args) {
        double weight = 80.0;
        double imb = 1.52;

        var bmiCalculator = new BmiCalculator();
        var bmi = bmiCalculator.calculateBmi(weight, imb);
        var weightCategory = BmiCalculator.bmiToWeightCategory(bmi);

        System.out.println(weightCategory);
    }
}
