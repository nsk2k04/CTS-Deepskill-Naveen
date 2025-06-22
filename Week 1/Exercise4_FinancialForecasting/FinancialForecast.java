package forecast;

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double predictFutureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue; // Base case
        }
        return (1 + growthRate) * predictFutureValue(presentValue, growthRate, years - 1);
    }

    public static void main(String[] args) {
        double presentValue = 10000; // ₹10,000
        double growthRate = 0.08;    // 8% annual growth
        int years = 5;

        double futureValue = predictFutureValue(presentValue, growthRate, years);
        System.out.printf("Future Value after %d years: ₹%.2f\n", years, futureValue);
    }
}
