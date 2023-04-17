public class Bank {


    public static void main(String[] args) {
        int deliveryDistance = 95;
        if (deliveryDistance < 80) {
            int deliveryDays = deliveryDistance / 20 + 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("К сожалению, доставка в указанную точку не осуществляется.");
        }

    }
}