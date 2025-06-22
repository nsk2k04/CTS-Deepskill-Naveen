package forecast;

public class ForecastMain {
    public static double futureValue(double pv, double rate, int years) {
        if (years == 0) return pv;
        return (1 + rate) * futureValue(pv, rate, years - 1);
    }

    public static void main(String[] args) {
        double result = futureValue(10000, 0.08, 5);
        System.out.printf("Future Value after 5 years: ₹%.2f\n", result);
    }
}
