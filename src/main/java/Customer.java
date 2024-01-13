import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
    private String name;
    private int age;
    private int phone;
    private Gender gender;

    public enum Gender {
        MALE, FEMALE
    }
}