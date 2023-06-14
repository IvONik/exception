import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ParsData {

    public static String[] parse(String[] arr) {

        for (int i = 0; i <= 3; i++) {

            if (arr[i] == "[0-9]") {
                throw new NumberFormatException("неверный формат, соержит цифры");
            } else return arr;
        }

        // SimpleDateFormat format = new SimpleDateFormat("dd.mm.yyyy");
        // Date birthDate;
        // try {
        //     birthDate = DateFormat(arr[3]);
        // }catch (ParseException e){
        //     throw new ParseException("Неверный формат даты рождения", e.getErrorOffset());
        // }
        
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd.mm.yyyy");
            Date birthDate = (Date) format.parse(arr[3]);            
            return arr;            
        } catch (ParseException ex) {
            ex.printStackTrace();

        int phoneNumber;
        try {
            phoneNumber = Integer.parseInt(arr[4]);
        }catch (NumberFormatException e){
            throw new NumberFormatException("Неверный формат телефона");
        }

        String sex = arr[5];
            if (!sex.toLowerCase().equals("m") && !sex.toLowerCase().equals("f")){
            throw new RuntimeException("Неверно введен пол");
        }

        return arr;
    }
}
}
