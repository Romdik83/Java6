public class CreditPaymentService {
    public int calculate(double percent , int amount, int mounth) {
        double result;
        double x = percent / 100 / mounth;



        result = amount * ( x + x / (( Math.pow( 1 + x ), mounth ) - 1 ));

        return(int) result;
    }
}
