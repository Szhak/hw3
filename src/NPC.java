import java.util.ArrayList;
import java.util.List;
public class NPC implements CloneableGameEntity {
    private final String name;
    private final String description;
    private final int health;
    private final List<String> inventory;
    public NPC(String name, String description, int health, List<String> inventory) {
        this.name = name;
        this.description = description;
        this.health = health;
        this.inventory = new ArrayList<>(inventory);
    }
    @Override
    public NPC cloneEntity() {
        return new NPC(this.name, this.description, this.health, this.inventory);
    }
    @Override
    public String toString() {
        return "NPC{name='" + name + "', description='" + description + "', health=" + health + ", inventory=" + inventory + "}";
    }
}
