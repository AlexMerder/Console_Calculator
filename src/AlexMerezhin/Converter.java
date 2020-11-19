package AlexMerezhin;


import java.util.List;

//Класс, отвечающий за преобразование латинских цифр в арабские и наоборот
class Converter {
    private static final String[] LATIN_NUMS =
            new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    static int convertLatinToArabic(String str) throws CalcException {
        for (int i = 0; i < LATIN_NUMS.length; i++) {
            if (str.equals(LATIN_NUMS[i])) return i + 1;
        }
        throw new CalcException(StringConstants.ExceptionMessages.LATIN_CONVERT_ERROR);
    }

    public static String convertArabicToLatin(int num) throws CalcException {
        if(num == 0) return "Ноль";
        if ((num < 0) || (num > 4000)) {
            throw new CalcException(StringConstants.ExceptionMessages.ARABIC_CONVERT_ERROR);
        }
        List<RomanNums> romanNums = RomanNums.reverseAndSorted();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while ((num > 0) && (i < romanNums.size())) {
            RomanNums rn = romanNums.get(i);
            if (rn.getValue() <= num) {
                sb.append(rn.name());
                num -= rn.getValue();
            } else {
                i++;
            }
        }
        return sb.toString();
    }
}