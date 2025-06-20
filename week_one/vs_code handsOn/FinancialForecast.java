public class FinancialForecast {
    public double forecast(double presentValue, double rate, int years){
        if(years == 0)
        return presentValue;
        double pV = presentValue * (rate + 1);
        return forecast(pV, rate, years - 1);
    }
    public double iterativeFF(double presentValue, double rate, int years){
        double ans ;
        ans = presentValue * Math.pow(1 + rate, years);
        return ans;
    }
}
