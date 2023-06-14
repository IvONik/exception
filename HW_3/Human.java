import java.util.Scanner;
import java.util.Objects;

public class Human {
    String surname;
    String name;
    String faserName;
    String birthDate;
    String phoneNumber;   
    String sex;
      

    public Human(String surname, String name, String faserName, String birthDate, String phoneNumber, String sex) {
        this.surname = surname;
        this.name = name;
        this.faserName = faserName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + faserName + " " + birthDate + " " + phoneNumber + " " + sex;
    }
    
        
    
}
