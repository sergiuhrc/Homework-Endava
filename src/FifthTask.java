public class FifthTask {
    public static void main(String[] args) {
        String text = "1Ser   !@#dfzvjhsdzc b  b   s s hsdfjsdfv sdvf sdkfv&^S98wqe6giu";

        int letter=0;
        int number = 0;
        int space = 0;
        int other = 0;
        System.out.println("The string is : "+text);
        for (int i = 0; i <text.length() ; i++) {

            if ((text.charAt(i)>=65)&&(text.charAt(i)<=122)){
                letter++;
            }else if ((text.charAt(i)>=43)&&(text.charAt(i)<=57)){
                number++;
            }else if (text.charAt(i)==32){
                space++;
            }else {
                other++;
            }
        }
        System.out.println("Letters "+letter);
        System.out.println("Numbers "+number);
        System.out.println("Spaces "+space);
        System.out.println("Other "+other);


    }
}
