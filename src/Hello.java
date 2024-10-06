public class Hello {

    public static void main(String[] args) {

        int myFirstVariable = 100; //instantiez varaiabila la defintie
        int mySecondVariable= 0;
        final int MAX_SIZE = 10;
        final double PI = Math.PI;

        System.out.println("Hello world! ");

        System.out.println("Second variable value is:" + mySecondVariable);

        System.out.println(args[0]+args[1]);

        int operantLeft = Integer.parseInt(args[0]);
        int operantRight = Integer.parseInt(args[1]);
        System.out.println(operantRight+operantLeft);

        String currentDay= "Monday";

        switch (currentDay){
            case "Monday":{
                System.out.println("Noo Monday");
                break;
            }
            case "Friday":{
                System.out.println("yeeee Friday");
                break;
            }
            default:{
                System.out.println("meeh");
            }

        }
        int currentNumber=1;
        while(currentNumber<=MAX_SIZE){
            System.out.println("Current number is " + currentNumber);
            currentNumber++;
        }

        currentNumber = 11;
        do{
            System.out.println("Current number is " + currentNumber);
            currentNumber++;
        }
        while (currentNumber<=MAX_SIZE);

        for (int i = 1; i <= MAX_SIZE; i++) {
            System.out.println("Current number is" + i);

        }

        for(String arg:args){
            System.out.println(arg);
        }

    }



}
