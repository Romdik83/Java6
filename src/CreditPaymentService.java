public class CreditPaymentService {
    public int calculate(double percent, int amount, int mounth) {
        double result;
        double monthlyPercentage = percent / 100 / 12;


        result = amount * (monthlyPercentage + monthlyPercentage / (Math.pow((1 + monthlyPercentage), mounth) - 1));


        return (int) result;
    }
}
