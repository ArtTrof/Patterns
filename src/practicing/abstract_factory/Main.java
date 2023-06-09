package practicing.abstract_factory;

import practicing.abstract_factory.factories.HumanFactory;
import practicing.abstract_factory.factories.MaleFactory;

public class Main {
    public static void main(String[] args) {
        HumanFactory factory = new MaleFactory();
        Child boy = new Child(factory);
        boy.info();
    }
}
