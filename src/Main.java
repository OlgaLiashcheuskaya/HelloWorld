import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //1 задание:
        int score;
        do {System.out.print("Please enter your score: ");
            score = new Scanner(System.in).nextInt();
                if (score >= 0 && score <= 100) {
                    System.out.println("Congrats! You’ve passed the test!");
                } else {
                    System.out.println("Введено некорректное значение");
                        }
        } while (score <= 0 || score >= 100);

        //2 задание:
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        while (!str.equalsIgnoreCase("Exit")) {
            System.out.println("Please enter something");
            str = scanner.nextLine();
        }

        //3 задание:
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

        //Второй вариант - запрет на ввод отрицательных чисел:
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

        //4 задание:
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

            /* Дополнительные задания
            Условные операторы:
             №1
        Пользователь вводит в консоли число. Если оно больше 10, выдаем в консоли сообщение
        “Число больше десяти”, если меньше – “Число меньше десяти”*/

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 10) {
            System.out.println("Число больше десяти");
        } else if (number < 10) {
            System.out.println("Число меньше десяти");
        }

            /*2
          Пользователь вводит в консоли два числа, выводим сообщение “первое число больше/меньше,
          чем второе” в зависимости от результата их сравнения */

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > y) {
            System.out.printf("%d больше %d", x, y);
        } else {
            System.out.printf("%d меньше %d", x, y);
        }

           /*3
         Пользователь вводит в консоли длины сторон треугольника (три числа),
        выводим сообщение, является ли треугольник равнобедренным, равносторонним или разносторонним.*/

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

             /* 4
            Пользователь вводит в консоли четыре числа. Рассчитываем
            и выводим в консоль количество отрицательных и положительных чисел
              */
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
        }
        if (y > 0) {
            countPositive = countPositive + 1;
        } else {
            countNegative = countNegative + 1;
        }
        if (z > 0) {
            countPositive = countPositive + 1;
        } else {
            countNegative = countNegative + 1;
        }
        if (m > 0) {
            countPositive = countPositive + 1;
        } else {
            countNegative = countNegative + 1;
        }
        System.out.println("Количество положительных чисел " + countPositive);
        System.out.println("Количество отрицательных чисел " + countNegative);

              /* 5
              Пользователь вводит в консоли три числа, выводим самое большое из них.
              */
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
        }

            /* 6
           Пользователь вводит в консоли три числа. Рассчитываем и выводим в консоль сумму
           наибольшего и наименьшего из них
            */
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

                    /*7
            Пользователь вводит в консоли число. Выводим сообщение о том, четное число, или нечетное
           */
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int remain = x % 2;
        if (remain == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");
        }

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

        /*
                Циклы:
         1
        Вывести в консоль таблицу умножения на 4 */
        int x = 10;
        for (int i = 0; i <= x; i++ ) {
            int count = 4 * i;
            System.out.printf("4 * %d = %d \n", i, count);
        }

        /* 2
        Пользователь вводит число - х. Выводим в консоль все четные числа от нуля до х
                 */
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 0; i <= x; i += 2 ){
            System.out.println(i);
        }

        /* 3
        Пользователь вводит число - х. Выдаем число из последовательности фибоначчи с индексом х */
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] arr = new int[x + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < arr.length; ++i) {
           arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[x]);

        /* 4
        Пользователь вводит число. Выводим в консоль факториал этого числа
         */
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int count = 1;
        for (int i = 1; i <= x; i++ ) {
            count = count * i;
        }
        System.out.println(count);

        /* 5
        Пользователь вводит строку. Выводим в консоль эту строку посимвольно (одна строка – один символ)
        */

        Scanner scanner = new Scanner(System.in);
        String String = scanner.nextLine();
        char[] chars = String.toCharArray();

        for (char aChar : chars) {
            System.out.println(aChar);
        }

        /*Массивы:
        1.
        Дан массив с целыми числами. Вывести в консоль количество положительных и отрицательных чисел в нем
        */
        int [] arr = {1, 5, 15, -47, -14, 8};
        int countPositive = 0;
        int countNegative = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                countPositive = countPositive + 1;
            } else if (arr[i] < 0) {
                countNegative = countNegative + 1;
            }
        }
        System.out.println("Количество положительных чисел - " + countPositive);
        System.out.println("Количество отрицательных чисел - " + countNegative);

        /* 2
        Дан массив с целыми числами. Вывести в консоль сумму элементов с четными индексами
         */
        int [] arr = {1, 5, 15, -47, 14, 8, 8};
        int countPositive = 0;
        for (int i = 0; i < arr.length; i += 2) {
            countPositive = countPositive + arr [i];
            }
        System.out.println("Сумма элементов с четными индексами " + countPositive);

        /* 3
        Дан массив с целыми числами. Вывести в консоль сумму четных элементов (четные значения)
         */
        int[] arr = {1, 5, 15, 44, 14, 8, 8};
        int countPositive = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countPositive = countPositive + arr[i];
            }
        }
        System.out.println("Сумма етных элементов " + countPositive);

        /* 4
        Дан массив с целыми числами. Вывести в консоль наибольшее из них
         */
        int[] arr = {1, 500, 150, 44, 14, 8, 8};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Наибольшее целое число " + max);

        /* 5
        Дан массив с целыми числами. Вывести в консоль наиболее часто встречающееся.
        Если таких несколько, то вывести наибольшее из них, если повторяющихся нет, вывести соответствующее сообщение.
                 */
        int[] arr = {1, 500, 153, 44, 14, 9, 9, 8, 8, 150};
        int firstRepeating = 0;       //кол-во совпадений по каждой проверке
        int countOfRepeating = 0;     // кол-во повторений сравнение
        int repeatingNumber = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (num == arr[j]) {
                    firstRepeating = firstRepeating + 1;
                }
            }
            if (firstRepeating > countOfRepeating) {
                countOfRepeating = firstRepeating;
                repeatingNumber = num;
            } else if (firstRepeating == countOfRepeating) {
                if (num > repeatingNumber) {
                    repeatingNumber = num;
                }
            }
            firstRepeating = 0;
        }

        if (countOfRepeating < 2) {
            System.out.println("Повторяющихся значений не найдено");
        } else {
            System.out.println("Number of repeating " + countOfRepeating);
            System.out.println("Repeating number " + repeatingNumber);

        }

     /* 6 (7 дубль)
          Дан двумерный массив 10х10 с целыми числами.
          Вывести в консоль все числа по диагонали от [0][0] до [10][10]
       */
        int [][] arrays = new int[10][10];
        arrays [0][0] = 3;
        arrays [2][2] = 3;

        for (int i = 0; i < arrays.length; i ++){
            int j = i;
            System.out.println(arrays [i][j]);
        }

    /* 8
    Дан двумерный массив 5х5 с целыми числами.
    Посчитать суммы чисел в каждом столбце и вывести наибольшую из них
        */

           int [][] arrays = new int[5][5];
        arrays [0][0] = 3;
        arrays [1][0] = 5;
        arrays [2][2] = 7;
        arrays [2][0] = 9;
        arrays [3][2] = 12;
        arrays [2][4] = 6;
        arrays [4][1] = 4;
        arrays [0][3] = 4;
        arrays [3][4] = 10;
        arrays [0][2] = 9;

        int maxSum = 0;
        for (int i = 0; i < arrays.length; i++) {
            int result = 0;
            for (int j = 0; j < arrays.length; j++) {
                result = result + arrays[i][j];
            }
            if (result > maxSum) {
                maxSum = result;
            }
            System.out.printf("Сумма чисел %d столбца = %d\n", i, result);
        }
        System.out.println("Наибольшая сумма: " + maxSum);
    }
}