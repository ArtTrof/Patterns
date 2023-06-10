package practicing.prototype;

public class Movie implements PrototypeCapable{
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public Movie clone() throws CloneNotSupportedException {
        Movie clone = (Movie) super.clone();
        System.out.println("Cloning movie obj...");
        return clone;
    }
}
