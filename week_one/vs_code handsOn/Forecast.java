public class Forecast {
    public static void main(String[] args){
        FinancialForecast ffc = new FinancialForecast();
        double initialInvestment = 1000.0;
        double growthRate = 0.05;
        int forecastYears = 5;
        double ans = ffc.iterativeFF(initialInvestment, growthRate, forecastYears);
        System.out.printf("The predicted value of the investment is: %.2f", ans);
    }
}
