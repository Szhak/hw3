import java.util.ArrayList;
import java.util.List;
public class Room implements CloneableGameEntity {
    private final String name;
    private final String description;
    private final List<String> features;
    public Room(String name, String description, List<String> features) {
        this.name = name;
        this.description = description;
        this.features = new ArrayList<>(features);
    }
    @Override
    public Room cloneEntity() {
        return new Room(this.name, this.description, this.features);
    }
    @Override
    public String toString() {
        return "Room{name='" + name + "', description='" + description + "', features=" + features + "}";
    }
}
