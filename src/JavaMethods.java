public class JavaMethods {

    public static void main(String[] args) {

//        System.out.println("Hello 2!!");
//
//        float myFloat = myFirstMethod(50, 70);
//        System.out.println(myFloat);
//        System.out.println("Number is odd?  " + isOddNumber(100));
//        printMessage(100);

//        drawFullShape(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
//        System.out.println("-------------------------------------------------");
//        drawShapeOutline(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
//        System.out.println("-------------------------------------------------");
//        drawShapeCorners(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

        drawFullShape(Integer.parseInt(args[0]));

//        addNumbers(1, 100);
//        addNumbers(500f, 600f);
//        addNumbers(105.6, 88.45);



    }
//  Overloading
    private static void addNumbers(int i, int j) {
        System.out.println("adding 2 int numbers with sum " + (i+j));
    }
    private static void addNumbers(float i, float j) {
        System.out.println("adding 2 float numbers with sum " + (i+j));
    }
    private static void addNumbers(double i, double j) {
        System.out.println("adding 2 double numbers with sum " + (i+j));
    }


    private static void drawShapeCorners(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i == 0 && j == 0) ||
                        (i == 0 && j == width-1) ||
                        (i == height-1 && j == 0) ||
                        (i == height-1 && j==width-1)){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");

            }
            System.out.println();

        }

    }
    private static void drawShapeCorners(int length) {
        drawShapeCorners(length,length);

    }

    private static void drawShapeOutline(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
    private static void drawShapeOutline(int length) {
        drawShapeOutline(length,length);
    }

    private static void drawFullShape(int width, int height) {

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width-1)
                System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();

        }
    }
    private static void drawFullShape(int length) {
        drawFullShape(length,length);
    }

    public static float myFirstMethod(float input1, float input2){

        return input1 + input2;

    }

    public static boolean isOddNumber( int number){

        return number % 2 != 0;
    }

    public static void printMessage(int number){
//        if(isOddNumber(number)){
//            System.out.println("Number " + number + " is odd !");
//        }
//        else{
//            System.out.println("Number " + number + " is even !");
//        }
        String type = isOddNumber(number) ? "odd" : "even";
        System.out.println("Number " + number + " is " + type + " !");
    }

}
