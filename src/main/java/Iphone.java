public class Iphone extends Mobile{

    public Iphone(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void call(String message) {
        System.out.println("<iphone>Message : ["+message+"]");
    }
}
