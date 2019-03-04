package tasknrseven;

import java.util.ArrayList;

public class SeventhTask {
    public static void main(String[] args) {

        Person p = new Person("Sergiu",23, GenderEnum.MALE);
        Person p2 = new Person("Sanda",21, GenderEnum.FEMALE);
    differentObjectsMethod("Sergiu",'H',1,2f,10,2.3,p,"Hello",'A' ,"world",p2);

    }

    public static void  differentObjectsMethod(Object ... o){
        Double sumOfAllNumbers=0.0;
        StringBuilder sb = new StringBuilder();
        ArrayList<Person> list = new ArrayList<>();
        for (int i = 0; i <o.length ; i++) {
            if (o[i] instanceof Number){
                Number n = (Number) o[i];
                sumOfAllNumbers +=n.doubleValue();
            }
            else if ((o[i] instanceof Character)||(o[i] instanceof String)){
                sb.append(o[i]+" ");
            }
            else  if (o[i] instanceof Person){
                list.add((Person) o[i]);
            }
        }
        System.out.println("Sum of all numbers is: "+sumOfAllNumbers);
        System.out.println("Text from all strings and characters: "+sb);
        System.out.println("------All persons-------");
        list.stream().forEach(person ->{
            System.out.println(person);
        });

    }
}
