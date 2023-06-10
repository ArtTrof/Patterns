package practicing.prototype;

public class Main {

    public static void main(String[] args) {
        try {
            String moviePrototype = PrototypeFactory.getInstance(PrototypeFactory.ModelType.MOVIE).toString();
            System.out.println(moviePrototype);

            String albumPrototype = PrototypeFactory.getInstance(PrototypeFactory.ModelType.CARTOON).toString();
            System.out.println(albumPrototype);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
