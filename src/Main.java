public class Main {
    public static void main(String[] args) {
        int userAccount = 500;
        int replenishment = 1900;
        int bonus = replenishment >= 1000 ? replenishment / 100 : 0;
        userAccount = userAccount + replenishment + bonus;
        System.out.println("Бонусов начислено: " + bonus);
        System.out.println("Сумма вашего счета: " + userAccount);
    }
}
