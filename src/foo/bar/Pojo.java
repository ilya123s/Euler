package foo.bar;

public class Pojo {

    private String firstName;

    private String lastName;

    public Pojo() {
    };

    public Pojo(Pojo p) {
        this.firstName = p.getFirstName();
        this.lastName = p.getLastName();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
