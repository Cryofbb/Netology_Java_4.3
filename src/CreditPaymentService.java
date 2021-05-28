public class CreditPaymentService {
    public int calculate (int credit, int month, double yearlyPercent){
        double percent = yearlyPercent / 12 / 100; // Месячный процент
        double payment = credit * ((percent * Math.pow((1+percent), month)) / (Math.pow((1+percent), month) - 1));
        return (int)payment; // Аннуитетный платеж = Сумма * ((% * (( 1 + % ) ^ Срок)) / ((( 1 + % ) ^ Срок) - 1))
        }
}
