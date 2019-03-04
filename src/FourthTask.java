import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        word = word.toLowerCase();
        System.out.println(word.length());
        StringBuilder f= new StringBuilder();
        StringBuilder f2= new StringBuilder();
        for (int i = 0; i < word.length()/2; i++) {
            f.append(word.charAt(i));
        }

        if (word.length()%2==0){
            for (int i = word.length()-1; i >=word.length()/2 ; i--) {
                f2.append(word.charAt(i));
            }
        }else {
            for (int i = word.length()-1; i >word.length()/2 ; i--) {
                f2.append(word.charAt(i));
            }
        }
        System.out.println(f);
        System.out.println(f2);
        if (f.toString().contains(f2)){
            System.out.println("The word is palindrome");
        }else{
            System.out.println("The word is not palindrome");
        }

        }

    }

