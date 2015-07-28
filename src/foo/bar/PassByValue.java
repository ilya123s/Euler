package foo.bar;

public class PassByValue {

    public static void main(String args[]) {

        Pojo pojo1 = new Pojo();

        pojo1.setFirstName("Hi");
        System.out.println(pojo1.getFirstName());

        Pojo pojo2 = new Pojo();
        pojo2 = pojo1;

        System.out.println(pojo2.getFirstName());

        pojo2.setLastName("Bye");
        System.out.println(pojo1.getLastName());
        System.out.println(pojo2.getLastName());

    }

}
