public class Person {
    private String name;
    private Mobile mobile;

    public Person(String name) {
        this.name = name;
    }

    public void changeMobile(Mobile mobile){
        this.mobile = mobile;
    }

    public void use(String message){
        mobile.call(message);
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }
}
