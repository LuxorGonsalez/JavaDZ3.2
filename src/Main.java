public class Main {
    public static void main(String[] args) {
        int currentBalance = 500;
        int donate = 2100;
        int bonus = donate / 100;
        if (donate > 1000) {
            bonus = donate / 100;
        } else {
            bonus = 0;
        }
        int totalBalance = currentBalance + donate + bonus;

        System.out.println("Ваш баланс пополнен на: " + donate + " руб. ");
        System.out.println("Сумма бонусных рублей составила: " + bonus + " руб. ");
        System.out.println("Ваш текущий баланс после пополнения составляет: " + totalBalance + " руб. ");

    }
}