import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

        // 1
        String name = "Имя: Ольга ";
        String surname = "Фамилия: Лящевская ";
        String profession = "Профессия: Тестировщик ПО";
        System.out.println(name);
        System.out.println(surname);
        System.out.println(profession);

        // 2
        byte age = 29;
        System.out.println(age);

        short isShort = 3489;
        System.out.println(isShort);

        int d = 4;
        int b = 8;
        System.out.println(b / d);

        long isLong = 458796L;
        System.out.println(isLong);

        float isFloat = 2.1889F;
        System.out.println(isFloat);

        double isDouble = 544.89;
        System.out.println(isDouble);

        boolean isWorking = true;
        System.out.println(isWorking);

        char isChar = 'a';
        System.out.println(isChar);

        String myString = "This is my string";
        System.out.println(myString);

        // 3
        Scanner scanner = new Scanner (System.in);
        String userInput = scanner.nextLine();
        System.out.println(userInput);

        // методы работы со строками
        String usingMethods = "This is my homework";
        System.out.println(usingMethods.length());
        System.out.println(usingMethods.isEmpty());
        System.out.println(usingMethods.charAt(5));
        String using2Methods = "THIS is my work";
        System.out.println(usingMethods.equals(using2Methods));
        System.out.println(usingMethods.equals("This is my homework"));
        System.out.println(usingMethods.startsWith("Thi"));
        System.out.println(usingMethods.endsWith("ав"));
        System.out.println(usingMethods.contains("my"));
        String updateString = usingMethods.replace("is", "or");
        System.out.println(updateString);
        System.out.println(using2Methods.toLowerCase());

        String text = "Код подтверждения";
        int codeOfPerson = 3245;
        double summa = 10000.58;
        String message = String.format("Внимание! %s %d \nсумма %f", text, codeOfPerson, summa);
        System.out.println(message);

        StringBuffer buffer = new StringBuffer ("Hello! ");
        buffer.append(usingMethods);
        System.out.println(buffer);
        }
}

