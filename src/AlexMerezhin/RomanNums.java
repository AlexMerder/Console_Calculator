package AlexMerezhin;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Перечисление, представляющее все допустимые римские числа
//Допустим диапазон от 1 до 4000
public enum RomanNums {
    I(1), IV(4), V(5), IX(9), X(10),
    XL(40), L(50), XC(90), C(100),
    CD(400), D(500), CM(900), M(1000);

    private int value;

    public static List<RomanNums> reverseAndSorted() {
        return Arrays.stream(values())
                .sorted(Comparator.comparing((RomanNums e) -> e.value).reversed())
                .collect(Collectors.toList());
    }
    RomanNums(int num) {
        this.value = num;
    }

    public int getValue() {
        return value;
    }
}
