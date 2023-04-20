public class Bank {


    public static void main(String[] args) {
        int deliveryDistance = 79;
        int deliveryDays = Days(deliveryDistance);
        System.out.println("Для доставки вам карты за " + deliveryDays + " Дней");
    }
    public static int Days(int deliveryDistance) {

        if (deliveryDistance < 80) {
            int deliveryDays = deliveryDistance / 20 + 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        else {
            System.out.println("К сожалению, доставка в указанную точку не осуществляется.");

        }

        return deliveryDistance;
    }
}


//class Test {
//    public static void main (String [] args) {
//
//        System.out.print ("Введите число 1: ");
//        Scanner inputFigure = new Scanner (System.in);
//        int i = inputFigure.nextInt ();
//        if ( i==1) {
//            System.out.println ("Вы ввели число 1");
//        }
//        else {
//            System.out.println ("Вы ввели число не равное 1");
//        }
//    }
//}