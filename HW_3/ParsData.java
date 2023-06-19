import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParsData {

  public static String[] parsedData(String[] arr) throws ParseException {
    parseDateOfBirth(arr[3]);
    parsePhoneNumber(arr[4]);
    parseGender(arr[5]);
    return arr;
  }

  private static LocalDate parseDateOfBirth(String birthDate) throws ParseException {
    try {
      return LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    } catch (Exception e) {
      throw new NumberFormatException("Неверный формат даты рождения");
    }
  }

  private static long parsePhoneNumber(String phoneNumber) throws ParseException {
    try {
      return Long.parseLong(phoneNumber);
    } catch (NumberFormatException e) {
      throw new NumberFormatException("Неверный формат номера телефона");
    }
  }

  private static String parseGender(String sex) throws ParseException {
    if (!sex.equals("m") && !sex.equals("f")) {
      throw new RuntimeException("Неверно введен пол");
    }

    return sex;    
  }
}
