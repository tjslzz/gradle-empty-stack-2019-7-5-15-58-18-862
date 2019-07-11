public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public void change(Mobile mobile){
        if(mobile instanceof Iphone){
            ((Iphone) mobile).changeToIphone();
        }
        else if(mobile instanceof Andriod){
            ((Andriod) mobile).changeToAndriod();
        }
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
