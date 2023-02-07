public class Main {
    public static void main(String[] args) {
        int initialaccount = 400;
        int depositamount = 15000;
        int bonus = 0;
        if (depositamount > 1000) {
            bonus = depositamount/100;
        }
        int finalaccount = initialaccount + depositamount + bonus;
        System.out.println("Итоговый счёт: " + finalaccount);
        System.out.println(" Сумма бонуса: " + bonus);
    }
}