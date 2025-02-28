package edu.ratushniak.humanindeces;

public class Main {

    public static void main(String[] args) {
        double weight = 80.0;
        double imb = 1.52;

        var humanIMB = new HumanIMB(weight, imb);

        System.out.println(humanIMB.Result());
    }
}
