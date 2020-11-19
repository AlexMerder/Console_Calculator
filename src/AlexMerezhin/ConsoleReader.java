package AlexMerezhin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Класс, считывающий пользовательский ввод с консоли
class ConsoleReader {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    static String getUserInput() throws CalcException, IOException {
        String line = reader.readLine();
        if(line.isEmpty() || line == null)
            throw new CalcException(StringConstants.ExceptionMessages.EMPTY_LINE_ENTERED);
        return line;
    }
}