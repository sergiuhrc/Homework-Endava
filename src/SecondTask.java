import java.util.Scanner;

/**
 Test Data
 Input 1st integer: 25
 Input 2nd integer: 5
 Expected Output :
 Sum of two integers: 30
 Difference of two integers: 20
 Product of two integers: 125
 Average of two integers: 15.00
 Distance of two integers: 20
 Max integer: 25 Min integer: 5
 * */
public class SecondTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 1st integer:");
        int firstNumber = sc.nextInt();
        System.out.println("Input 2st integer:");
        int secondNumber = sc.nextInt();
        System.out.println("Sum of two integers: "+sumOfNumbers(firstNumber,secondNumber));
        System.out.println("Difference of two integers: "+differenceOfNumbers(firstNumber,secondNumber));
        System.out.println("Product of two integers: "+productOfNumbers(firstNumber,secondNumber));
        System.out.println("Average of two integers: "+averageOfNumbers(firstNumber,secondNumber));
        System.out.println("Distance of two integers: "+distanceOfNumbers( firstNumber, secondNumber));
        System.out.println("Max of two integers: "+maxNumber( firstNumber, secondNumber));
        System.out.println("Min of two integers: "+minNumber( firstNumber, secondNumber));


    }

    public static int sumOfNumbers(int firstNumber,int secondNumber){
        return firstNumber+secondNumber;
    }

    public static  int differenceOfNumbers(int firstNumber,int secondNumber){
        if (firstNumber>secondNumber){
            return firstNumber-secondNumber;
        }else if(firstNumber<secondNumber){
            return secondNumber-firstNumber;
        }else {
            return 0;
        }
    }

    public static  int productOfNumbers(int firstNumber,int secondNumber){
        return firstNumber*secondNumber;
    }

    public static  double averageOfNumbers(double firstNumber,double secondNumber){
            return (firstNumber +secondNumber)/2;
    }

    public static  int distanceOfNumbers(int firstNumber,int secondNumber){
        if (firstNumber>secondNumber){
            return firstNumber-secondNumber;
        }else if (secondNumber>firstNumber){
            return secondNumber-firstNumber;
        }else{
            return 0;
        }
    }
    public static  int maxNumber(int firstNumber,int secondNumber){
        if (firstNumber>secondNumber){
            return firstNumber;
        }else if(secondNumber>firstNumber){
            return secondNumber;
        }else {
            return secondNumber;
        }
    }

    public static  int minNumber(int firstNumber,int secondNumber){
        if (firstNumber>secondNumber){
            return secondNumber;
        }else if(secondNumber>firstNumber){
            return firstNumber;
        }else {
            return secondNumber;
        }
    }
}
