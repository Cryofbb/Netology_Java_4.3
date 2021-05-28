public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_500_000;
        double yearlyPercent = 15.99;
        int month = 16;
        int creditPayment = service.calculate(credit, month, yearlyPercent); // Вариант 0. Считает по заданным ранее данным
        // \n Для читаемости
        System.out.printf("\nПри сумме кредита %d рублей, ежемесячный платеж составит %d руб. Годовая процентная ставка: %.2f %%. \n\n", credit,creditPayment, yearlyPercent);
        // Ниже примеры рассчетов из дз
        int creditPaymentYear = service.calculate(1_000_000, 12, 9.99);        // Вариант 1. 1_000_000 на 12 мес под 9.99.
        int creditPaymentTwoYears = service.calculate(1_000_000, 24, 9.99);    // Вариант 2. 1_000_000 на 24 мес под 9.99.
        int creditPaymentThreeYears = service.calculate(1_000_000, 36, 9.99);  // Вариант 3. 1_000_000 на 36 мес под 9.99.
        // Я не понял как вытягивать в форматируемый текст данные из методов, поэтому тут только так.
        System.out.println("При кредите на год ежемесячный платеж составит " + creditPaymentYear + " руб.");
        System.out.println("При кредите на два года ежемесячный платеж составит " + creditPaymentTwoYears + " руб.");
        System.out.println("При кредите на три года ежемесячный платеж составит " + creditPaymentThreeYears + " руб.");
    }
}