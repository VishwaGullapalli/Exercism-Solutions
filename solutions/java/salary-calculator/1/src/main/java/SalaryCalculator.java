public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped < 5 ? 1.0 : 0.85;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold < 20 ? 10 : 13;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double finalSalaryEstimate = (1000.0 * salaryMultiplier(daysSkipped)) + bonusForProductsSold(productsSold);
        return finalSalaryEstimate <= 2000 ? finalSalaryEstimate : 2000;
    } 
}
