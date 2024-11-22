import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Person {

    private String name;
    private String surname;
    private String dateofBirth;

    public void eat(){
        System.out.println("The person eats healty every day. ");
    }


}
