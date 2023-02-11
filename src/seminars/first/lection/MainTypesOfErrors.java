//package seminars.first;
//
//public class MainTypesOfErrors {
//
////     Типы ошибок. Синтаксическая ошибка (в строке 7 отсутствует ;)
//    public static void main(String[] args) {
//        System.out.println("Hello world!")
//    }
//
////     Типы ошибок. Логическая-семантическая (строка 18)
//    public static void main(String[] args) {
//        compareNumbers(2, 2); // Вызывается метод сравнения двух чисел
//    }
//    private static void compareNumbers(int a, int b) {
//        if (a > b) {
//            System.out.printf("%d больше, чем %d", a, b);
//        }
//        if (a <= b) {  // Допущена ошибка -знак <= вместо <
//            System.out.printf("%d меньше, чем %d", a, b);
//        }
//    }
//
////     Типы ошибок. Ошибка выполнения (деление на ноль) - обычно не тестируется
//  public static void main(String[] args) {
//      int a = 10, b = 0;
//      System.out.printf("Result: %d", a / b);
//  }
//
//}
