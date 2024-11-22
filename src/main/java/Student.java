import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor @Setter @Getter
public class Student extends Person {

    private double[] grades;

    public void takeExams(){
        System.out.println("The student attends the exam.");
    }
}
