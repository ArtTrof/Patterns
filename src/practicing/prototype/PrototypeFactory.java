package practicing.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    public static class ModelType {
        public static final String MOVIE = "movie";
        public static final String CARTOON = "cartoon";
    }

    private static Map<String, PrototypeCapable> prototypes = new HashMap<>();

    static {
        prototypes.put(ModelType.MOVIE, new Movie());
        prototypes.put(ModelType.CARTOON, new Cartoon());
    }

    public static PrototypeCapable getInstance(final String s) throws CloneNotSupportedException {
        return ((PrototypeCapable) prototypes.get(s)).clone();
    }
}
