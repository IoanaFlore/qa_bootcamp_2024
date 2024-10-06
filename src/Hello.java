import java.util.ArrayList;

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


       // HOMEWORK
       // 1. Calculate the sum of the first 100 numbers higher than 0.
        int sum=0;
        for (int i=1;i<=100;i++){
            sum+=i;
        }
        System.out.println("The sum of the first 100 numbers is:" + sum);

        // 2. Display all the prime numbers lower than 1 000 000.
/*
        for (int i=2; i<=1000000;i++){
            boolean isPrime = true;
            for(int j =2; j<=i/2;j++){
                if (i % j == 0 ){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("Number" + i +" is prime.");
            }
        }
*/
        // 3. Display the number of days in month February from a year between
        // 1900-2016 that is read from keyboard
        //HINT
        //
        //A year is a leap year if:
        //
        //-Is divisible by 4 but not by 100
        //-Is divisible by 100 but not by 400

        int year = 2004;
        if(year>=1900 && year<=2024){
            int daysInFebruary;
            if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 != 0)) {
                daysInFebruary = 29;
            } else {
                daysInFebruary = 28;
            }
            System.out.println("The number of days in February in the year "+ year + " is " + daysInFebruary);
        }







    }

}
