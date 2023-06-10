package practicing.prototype;

public class Cartoon implements PrototypeCapable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Cartoon clone() throws CloneNotSupportedException {
        Cartoon clone = (Cartoon) super.clone();
        System.out.println("Cloning cartoon obj...");
        return clone;
    }
}
