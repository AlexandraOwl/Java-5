public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int surcharge = 1100;
        if (surcharge>1000){
            int bonus = surcharge/100;
            int total = bonus + surcharge + balance;
            System.out.println("Ваш баланс = " + total);
        }
        else {
            int total = balance + surcharge;
            System.out.println("Ваш баланс = " + total);
        }
    }
}