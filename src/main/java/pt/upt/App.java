package pt.upt;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();

        System.out.print("Quantos valores pretende introduzir? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Introduza o valor " + (i + 1) + ": ");
            double v = sc.nextDouble();
            descriptiveStatistics.addValue(v);
        }

        double mean = descriptiveStatistics.getMean();
        double median = descriptiveStatistics.getPercentile(50);
        double standardDeviation = descriptiveStatistics.getStandardDeviation();

        System.out.println("Resultados:");
        System.out.println("Média: " + mean);
        System.out.println("Mediana: " + median);
        System.out.println("Desvio padrão: " + standardDeviation);

        sc.close();
    }
}
