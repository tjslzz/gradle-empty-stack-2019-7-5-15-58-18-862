public abstract class Mobile {
    private String name;
    private String color;
    private  String brand;

    public abstract void call(String message);

    public void output(){
        System.out.println("name: ["+name+"], color: ["+color+"], brand: ["+brand+"]");
    }

    public Mobile(String name, String color, String brand){
        setName(name);
        setColor(color);
        setBrand(brand);
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected String getBrand() {
        return brand;
    }

    protected void setBrand(String brand) {
        this.brand = brand;
    }
}
