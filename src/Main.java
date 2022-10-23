public class Main {
    public static void main(String[] args) {

        int startCheck = 100; //начальный счет
        int payment = 800; //пополнение счета

        int bonus; //начисляемый бонус
        if (payment > 1000) {
            bonus = payment / 100;}
        else {
            bonus = 0;
        }

        int finalCheck = startCheck + payment + bonus; //итоговый счет

        System.out.println(finalCheck);
    }
}