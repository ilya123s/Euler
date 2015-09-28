package foo.bar;

public class StringImmutableTest {

    public static void main(String args[]) {

        String one = null;
        Pojo holder1 = new Pojo();

        holder1.setFirstName("Hello");

        one = holder1.getFirstName();
        System.out.println(holder1.getFirstName());
        System.out.println(one);
        holder1.setFirstName("Bye");
        System.out.println("--------------------");
        System.out.println(holder1.getFirstName());
        System.out.println(one);

    }

}
