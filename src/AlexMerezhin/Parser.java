package AlexMerezhin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Класс, выполняющий анализ введённой пользователем строки
public class Parser {
    private static Pattern pattern1 = Pattern.compile(StringConstants.REGEXP_1);
    private static Pattern pattern2 = Pattern.compile(StringConstants.REGEXP_2);

    private Matcher matcher1;
    private Matcher matcher2;

    static byte getVersionExpr(String str){
        Matcher matcher1 = pattern1.matcher(str);
        Matcher matcher2 = pattern2.matcher(str);
        if(matcher1.find()) {
            return 1;
        } else if(matcher2.find()){
            return 2;
        }
        return 0;
    }
    static Object[] parse(String str, byte versionExpr) throws CalcException {
        Matcher matcher;
        Object[] calcArgs = new Object[3];

        switch (versionExpr) {
            case 1:
                matcher = pattern1.matcher(str);
                if (matcher.find()) {
                    calcArgs[0] = Integer.parseInt(matcher.group(1));
                    calcArgs[1] = Integer.parseInt(matcher.group(3));
                    calcArgs[2] = matcher.group(2);
                }
                break;
            case 2:
                matcher = pattern2.matcher(str);
                if (matcher.find()) {
                    calcArgs[0] = Converter.convertLatinToArabic(matcher.group(1));
                    calcArgs[1] = Converter.convertLatinToArabic(matcher.group(3));
                    calcArgs[2] = matcher.group(2);
                }
                break;
            case 0:
                throw new CalcException(StringConstants.ExceptionMessages.UNKNOWN_EXPRESSION);
        }
        return calcArgs;
    }
}