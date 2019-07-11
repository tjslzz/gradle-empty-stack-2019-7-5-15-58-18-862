public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void user(Mobile mobile, String message){
        mobile.call(message);
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }
}
