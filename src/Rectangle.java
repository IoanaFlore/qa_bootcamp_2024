public class Rectangle {
    private double length;
    private double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return this.width * this.length;
    }

    public double getPerimeter(){
        return 2 * (width * length);
    }

    public double getDiagonal(){
        return Math.sqrt(Math.pow(width,2) + Math.pow(length,2));
    }
}
