import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Square {

    private double squareSide;



    public void setSide(double squareSide){
        this.squareSide = squareSide;
    }

    public double getArea(){
        return squareSide * squareSide;
       // return Math.pow(squareSide, 2);
    }

    public void printCurrentSquare(){
        System.out.println("Square with side " + this.squareSide + " has area of " + getArea());
    }

    public static void printSquare(Square sq){
        System.out.println("Square with side " + sq.getSquareSide() + " has area of " + sq.getArea());
    }
}
