import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
public class Rectangle extends Shape{
    @Getter @Setter
    private double length;
    @Getter @Setter
    private double width;



    public double getArea(){
        return this.width * this.length;
    }

    public double getPerimeter(){
        return 2 * (width * length);
    }

    public double getDiagonal(){
        return Math.sqrt(Math.pow(width,2) + Math.pow(length,2));
    }

    @Override
    public void draw(){
        super.draw(); // this calss the methos from the super class
        System.out.println("Drawing a rectangle");
    }
}
