public
class Main {
    public static void main(String[] args) {
        int balance = 250;
        int bonus = 1;
        int refill = 2450;
        if (refill > 1000) {
            bonus = 1;
        } else {
            bonus = 0;
        }
        long totalBonus = refill * bonus / 100;
        System.out.println(totalBonus);
    }
}