public class CreditPaymentService {
    public int calculate(double percent, int amount, int mounth) {

        double monthlyPercentage = percent / 100 / 12;

        double result = amount * (monthlyPercentage + monthlyPercentage / (Math.pow((1 + monthlyPercentage), mounth) - 1));

        return (int) result;
    }
}
