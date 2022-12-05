public class Main {
    public static void main(String[] args) {
        //homework1
        //task №1
        System.out.println("Задача №1");
        int [] numbers = new int [3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();

        //task №1.1
        System.out.println("Задача №1.1");
        double [] fractionalNumbers = {1.57, 7.654, 9.986};
        for (int i = 0; i < fractionalNumbers.length; i++) {
            System.out.println(fractionalNumbers[i]);
        }
        System.out.println();

        //task №1.2
        System.out.println("Задача №1.2");
        int [] apartments = {11, 12, 13, 21, 22, 23, 31, 32, 33};
        for (int i = 0; i < apartments.length; i++) {
            System.out.println(apartments[i]);
        }
        System.out.println();

        //task №2
        System.out.println("Задача №2");
        int [] number = new int [3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int i = 0; i < 3; i++) {
            if (i == number.length - 1) {
                System.out.print(number[i]);
            } else {
                System.out.print(number[i] + ", ");
            }
        }
        System.out.println();

        double [] fractionalNumber = {1.57, 7.654, 9.986};
        for (int i = 0; i < fractionalNumber.length; i++) {
            if (i == fractionalNumber.length - 1) {
                System.out.print(fractionalNumber[i]);
            } else {
                System.out.print(fractionalNumber[i] + ", ");
            }
        }
        System.out.println();

        int [] apart = {11, 12, 13, 21, 22, 23, 31, 32, 33};
        for (int i = 0; i < apart.length; i++) {
            if (i == apart.length - 1) {
                System.out.print(apart[i]);
            } else {
                System.out.print(apart[i] + ", ");
            }
        }
    }
}