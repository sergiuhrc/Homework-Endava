import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstTask {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a value between 0 and 1000");
        String inputValue = br.readLine();
        int parsedValue = Integer.parseInt(inputValue);
        if (parsedValue<0||parsedValue>1000){
            System.out.println("Sorry, the number must be between 0 and 1000");
        }else{
            int sumOfNumbers = 0;
         int[] numbers = new int[inputValue.length()];
            for (int i = 0; i <numbers.length ; i++) {
                numbers[i]=inputValue.charAt(i)-'0';
                sumOfNumbers+=numbers[i];
            }
            System.out.println(sumOfNumbers);
        }

    }

}
