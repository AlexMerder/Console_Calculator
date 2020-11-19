package AlexMerezhin;

//Класс, содержащий строковые константы
final class StringConstants {
    final static String REGEXP_1 = "^\\s*([1-9]|10)\\s*([-+*\\/])\\s*([1-9]|10)\\s*$";
    final static String REGEXP_2 =
            "^\\s*(I|II|III|IV|V|VI|VII|VIII|IX|X)\\s*([-+*\\/])\\s*(I|II|III|IV|V|VI|VII|VIII|IX|X)$\\s*";

    static class ExceptionMessages {
        static final String LATIN_CONVERT_ERROR = "Ошибка преобразования латинских цифр в арабские!";
        static final String ARABIC_CONVERT_ERROR = "Ошибка преобразования арабских цифр в латинские: " +
                "\nИсходное число не удовлетворяет допустимому диапазону [0,4000]";
        static final String UNKNOWN_OPERATION = "Неизвестная операция!";
        static final String UNKNOWN_EXPRESSION = "Введено недопустимое выражение!";
        static final String EMPTY_LINE_ENTERED = "Введена пустая строка!";
    }
}