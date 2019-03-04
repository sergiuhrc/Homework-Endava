import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ThirdTask {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine();
        StringBuilder reversedText=new StringBuilder();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i <text.length() ; i++) {
            list.add(text.charAt(i));
        }

        ArrayList<Character> reversedList =new ArrayList<>();
        for (int i = list.size()-1; i >=0 ; i--) {
            reversedList.add(list.get(i));

        }

        for (int i = 0; i <reversedList.size() ; i++) {
            reversedText.append(reversedList.get(i));
        }

        System.out.println("Reverse string: "+reversedText);
    }
}
