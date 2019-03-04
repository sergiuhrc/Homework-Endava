import tasknrseven.GenderEnum;
import tasknrseven.Person;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Person p = new Person("Sergiu",23, GenderEnum.MALE);
        System.out.println(p);
    }
}
