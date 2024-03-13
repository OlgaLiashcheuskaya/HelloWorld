import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//        //1
        int score;
        do {System.out.print("Please enter your score: ");
            score = new Scanner(System.in).nextInt();
                if (score >= 0 && score <= 100) {
                    System.out.println("Congrats! You’ve passed the test!");
                } else {
                    System.out.println("Введено некорректное значение");
                        }
        } while (score <= 0 || score >= 100);
//
//        //2
        String str = new String();
        Scanner scanner = new Scanner(System.in);
        while (!str.equalsIgnoreCase("Exit")) {
            System.out.println("Please enter something");
            str = scanner.nextLine();
        }
//
//        //3
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = scanner.nextInt();
        int sum = 0;
        if (x >= 0) {
            for (int i = 0; i <= x; i++) {
                sum += i;
            }
        } else {
            for (int i = 0; i >= x; i--) {
                sum += i;
            }
        }
        System.out.printf("The sum of all numbers from 0 to %d is %d", x, sum);
//
//        //Второй вариант - запрет на ввод отрицательных чисел:
        int x;
        int sum = 0;
        System.out.print("Please enter a number: ");
        do {
            x = new Scanner(System.in).nextInt();
            if (x >= 0) {
                for (int i = 0; i <= x; i++) {
                    sum += i;
                }
                System.out.printf("The sum of all numbers from 0 to %d is %d", x, sum);
            } else {
                System.out.print("Please enter a number greater than or equal to zero: ");
            }
        } while (x < 0);
//
//
//        //4
        String[] channels = {"BT", "ONT", "MIR", "NTV", "TNT", "NATIVE", "KIDS", "MUSIC", "RNC"};
        Scanner scanner = new Scanner(System.in);

        do {
            int number;
            System.out.print("Введите номер канала: ");
            number = scanner.nextInt();
            if (number > 0 && number < 10) {
                System.out.println("Название канала " + channels[number - 1]);
                } else if (number < 0 || number >= 10) {
                    System.out.println("Номер канала не найден, попробуйте еще раз");
                }  else if (number == 0) {
                    System.out.println("Exit");
                    break;
                }
        } while (true);
//
//           /* Дополнительные задания
//          Условные операторы:
//             №1
//         Пользователь вводит в консоли число. Если оно больше 10, выдаем в консоли сообщение
//        “Число больше десяти”, если меньше – “Число меньше десяти”*/
//
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 10) {
            System.out.println("Число больше десяти");
        } else if (number < 10) {
            System.out.println("Число меньше десяти");
        }
//
//
//        /*2
//        Пользователь вводит в консоли два числа, выводим сообщение “первое число больше/меньше,
//               чем второе” в зависимости от результата их сравнения */
//
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > y) {
            System.out.printf("%d больше %d", x, y);
        } else {
            System.out.printf("%d меньше %d", x, y);
        }
//
//        /*3
//         Пользователь вводит в консоли длины сторон треугольника (три числа),
//        выводим сообщение, является ли треугольник равнобедренным, равносторонним или разносторонним.*/
//
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if (x == y && x == z && z == y) {
            System.out.println("треугольник равносторонний");
        } else if (x == y || x == z || z == y){
            System.out.println("треугольник равнобедренный");
        } else {
            System.out.println("треугольник разносторонний");
        }
//
//       /* 4
//       Пользователь вводит в консоли четыре числа. Рассчитываем
//       и выводим в консоль количество отрицательных и положительных чисел
//        */
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int m = scanner.nextInt();
        int countPositive = 0;
        int countNegative = 0;

        if (x > 0) {
            countPositive = countPositive + 1;
        } else {
            countNegative = countNegative + 1;
        };
        if (y > 0) {
            countPositive = countPositive + 1;
        } else {
            countNegative = countNegative + 1;
        };
        if (z > 0) {
            countPositive = countPositive + 1;
        } else {
            countNegative = countNegative + 1;
        };
        if (m > 0) {
            countPositive = countPositive + 1;
        } else {
            countNegative = countNegative + 1;
        };
        System.out.println("Количество положительных чисел " + countPositive);
        System.out.println("Количество отрицательных чисел " + countNegative);
//
//    /* 5
//       Пользователь вводит в консоли три числа, выводим самое большое из них.
//        */
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if (x > y && y > z) {
            System.out.println(x);
      } else if (y > x && x > z) {
            System.out.println(y);
        } else if (z > y && y > x) {
            System.out.println(z);
        };
//
//        /* 6
//        Пользователь вводит в консоли три числа. Рассчитываем и выводим в консоль сумму
//        наибольшего и наименьшего из них
//         */
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();


        int numberBig = 0;
        if (x > y && y > z) {
            System.out.println(x);
            numberBig = x;
        } else if (y > x && x > z) {
            System.out.println(y);
           numberBig = y;
        } else if (z > y && y > x) {
            System.out.println(z);
            numberBig = z;
        }

        int numberLittle = 0;
        if (x > y && y > z) {
            System.out.println(z);
            numberLittle = z;
        } else if (x > z && z > y) {
            System.out.println(y);
            numberLittle = y;
        } else if (z > y && y > x) {
            System.out.println(x);
            numberLittle = x;
        }

        System.out.println(numberLittle + numberBig);
//
//
//      /*7
//        Пользователь вводит в консоли число. Выводим сообщение о том, четное число, или нечетное
//       */
//
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int remain = x % 2;
        if (remain == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");
        }
//

                /*8
        Программа “Магазин”, выводим меню из трех товаров с ценами.
        Пользователь выбирает товар, вводит сумму денег.
        Если сумма меньше цены, выводим сообщение: “Денег не хватает!”,
        если сумма равна цене – “Спасибо за покупку!”, если больше – “Ваша сдача: [сумма сдачи]”
         */

        String [][] Shop = {
                {"Молоко", "3"},
                {"Сметана", "2"},
                {"Хлеб", "1"}
        };

        for (String[] product : Shop) {
            System.out.println(product [0] + ": " + product[1]);
            }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название продукта: ");
        String productName = scanner.nextLine();

        for (String[] costs : Shop) {
            if (costs[0].equalsIgnoreCase(productName)) {
                System.out.print("Введите сумму денег: ");
                int cost = Integer.parseInt(costs[1]);
                int sum = scanner.nextInt();

                if (sum < cost) {
                    System.out.println("Денег не хватает");
                } else if (sum > cost) {
                     int surrender = sum - cost;
                     System.out.println("Ваша сдача: " + surrender);
                } else {
                    System.out.println("Спасибо за покупку!");
                }
            }
        }




    }
}
