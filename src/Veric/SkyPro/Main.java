package Veric.SkyPro;

public class Main {

    public static void main(String[] args) {
// 1-Task
        int clientOS;
        // next line - place method, what get type OS client
        clientOS = 0; // пока "заглушка", только один вариант OS
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("К сожалению тип Вашей операционной системы не определен, " +
                    "приложение не может быть установлено");
        }
// 2-Task
        int clientDeviceYear;
        // next line - place method, what get DeviceYear
        clientDeviceYear = 2015; // пока "заглушка", только один вариант clientDeviceYear
/* Далее стало не совсем понятно по требованиям задачи
 * про отсутствие вложенности условий, и
 * закомментил код, по моему мнению, более правильный по реализации
 *
 *      if (clientOS == 0) {
 *           if (clientDeviceYear < 2015) {
 *               System.out.println("Установите облегченную версию для iOS по ссылке");
 *           } else {
 *               System.out.println("Установите версию приложения для iOS по ссылке");
 *           }
 *       } else if (clientOS == 1) {
 *           if (clientDeviceYear < 2015) {
 *               System.out.println("Установите облегченную версию приложения для Android по ссылке");
 *           } else {
 *               System.out.println("Установите версию приложения для Android по ссылке");
 *           }
 *           } else {
 *           System.out.println("К сожалению тип Вашей операционной системы не определен, " +
 *                   "приложение не может быть установлено");
 *       }
 */
        if ( clientOS != 0 && clientOS != 1) {
            System.out.println("К сожалению тип Вашей операционной системы не определен, " +
                    "приложение не может быть установлено");
        }
        if ( clientOS == 0 && clientDeviceYear >= 2015 ) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if ( clientOS == 0 && clientDeviceYear < 2015 ) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if ( clientOS == 1 && clientDeviceYear >= 2015 ) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if ( clientOS == 1 && clientDeviceYear < 2015 ) {
            System.out.println("Установите версию облегченную приложения для Android по ссылке");
        }
// Task-3
        int currentYear = 2020;
        // set logical rules to definition Leap Year
        boolean currentYearIsLeap = (currentYear % 400 == 0) || ((currentYear % 4 == 0) && (currentYear % 100 !=0));
        boolean currentYearIsLeap2 = currentYear % 400 == 0 || currentYear % 4 == 0 && currentYear % 100 !=0;
        /*Equals hmmm..
         * boolean currentYearIsLeap = currentYear % 400 == 0 || currentYear % 4 == 0 && currentYear % 100 !=0;
         * see boolean algebra? and compile+execute string from right to left, like in c/c++  ?
         */
        if (currentYearIsLeap) {
            System.out.println("Текущий год " + currentYear + " является високосным");
        }
        else {
            System.out.println("Текущий год " + currentYear + " не является високосным");
        }
// Task-4
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20 ) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("Для доставки карты потребуется " + deliveryDays + " дня");
// Task-5
        int monthNumber=12;
        switch (monthNumber) {
            case 1: case 2: case 12:
                System.out.println("Сейчас " + monthNumber + " месяц в году, сезон Зима");
                break;
            case 3: case 4: case 5:
                System.out.println("Сейчас " + monthNumber + " месяц в году, сезон Весна");
                break;
            case 6: case 7: case 8:
                System.out.println("Сейчас " + monthNumber + " месяц в году, сезон Лето");
                break;
            case 9: case 10: case 11:
                System.out.println("Сейчас " + monthNumber + " месяц в году, сезон Осень");
                break;
            default: System.out.println("Месяц нужно указывать в диапазоне 1-12(Январь-Декабрь)");
        }
    }
}

