import java.util.Scanner;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        String message = "Hello Jerry";
        Mobile mobile = new Mobile("JerryLi","black","201516080209");
        mobile.call(message);
        mobile.output();
        System.out.println();

        Iphone iphone = new Iphone("JerryLi","black","201516080209");
        iphone.call(message);
        mobile.output();
        System.out.println();

        Andriod andriod = new Andriod("JerryLi","black","201516080209");
        andriod.call(message);
        mobile.output();
        System.out.println();
    }
}
