
import java.util.Scanner;

public class ScannerInput {
    
    

    public static String [] inputData() throws ParseException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите, через пробел: Фамилия Имя Отчество датарождения номертелефона пол");
        String string = scanner.nextLine();
        String [] parts = string.split(" ");
        if (parts.length != 6)
            {throw new ParseException();}
        return parts;
    }

}   

