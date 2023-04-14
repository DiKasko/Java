public class Bank {
    public static int Days(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 40) {
            return 2;
        } else if (distance <= 60) {
            return 3;
        } else if (distance <= 80) {
            return 4;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int deliveryDistance = 95;
        int deliveryDays = Days(deliveryDistance);

        if (deliveryDays >= 0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("К сожалению, доставка в указанную точку не осуществляется.");
        }
    }
}