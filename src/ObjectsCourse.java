import java.lang.invoke.SwitchPoint;

public class ObjectsCourse {

    public static void main(String[] args) {
//      Car dacia1300 = new Car(); //instanteaza o variabila de tipu Car
        Car vwPassat = new Car();



//        dacia1300.color = "RED";
//        dacia1300.carType = "Sedan";
//        dacia1300.cylinderCapacity = 1300;
//        dacia1300.model = "dacia 1300";
//        dacia1300.carPosition = 45;

        Car dacia1300 = new Car("RED","Sedan",1300, "dacia 1300", 45);
        dacia1300.printCar();
        dacia1300.starCar();
        dacia1300.accelerate(20);
        dacia1300.gearUp();
        dacia1300.steerLeft(45);
        dacia1300.increaseMileage(5);
        dacia1300.stopCar();
        dacia1300.printCar();
        dacia1300.setSpeed(5000);
        System.out.println(dacia1300.getSpeed());


        Square squareabcd = new Square();
        squareabcd.setSide(5);
        //System.out.println("Square with side " + squareabcd.squareSide + " has area of " + squareabcd.getArea());
        squareabcd.printCurrentSquare();

        for (String value: args){
            Square cmdSqaure = new Square();
            cmdSqaure.setSide(Double.parseDouble(value));
            //System.out.println("Square with side " + cmdSqaure.squareSide + " has area of " + cmdSqaure.getArea());
//            cmdSqaure.printCurrentSquare();
            Utils.printSquare(cmdSqaure); // static method
        }


        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area is " + rectangle.getArea() + " diagonal is " + rectangle.getDiagonal() +
                " perimeters is " + rectangle.getPerimeter() );
    }
}
