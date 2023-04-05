package homework2;

public class Task01 {
    public static void main(String[] args) {
        /*1. Напишите метод, который принимает на вход строку (String)
        и определяет является ли строка палиндромом (возвращает boolean значение).*/
        IsStringPalindrome();
    }

    private static void IsStringPalindrome() {
        String input = "Шалаш";
        String revers = "";
        for (int i = 0; i < input.length(); i++) {
            revers = input.charAt(i) + revers;
        }
        System.out.println(input.equalsIgnoreCase(revers));
    }
}
