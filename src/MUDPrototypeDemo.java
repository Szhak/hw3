import java.util.ArrayList;
import java.util.List;
public class MUDPrototypeDemo {
    public static void main(String[] args) {
        List<String> roomFeatures = new ArrayList<>();
        roomFeatures.add("Torch");
        roomFeatures.add("Ancient Carvings");
        Room prototypeRoom = new Room("Dark Chamber", "A gloomy and dark chamber with flickering torches.", roomFeatures);
        List<String> npcInventory = new ArrayList<>();
        npcInventory.add("Dagger");
        npcInventory.add("Gold Coin");
        NPC prototypeNPC = new NPC("Goblin", "A small and mischievous creature.", 100, npcInventory);
        Room clonedRoom1 = prototypeRoom.cloneEntity();
        Room clonedRoom2 = prototypeRoom.cloneEntity();
        NPC clonedNPC1;
        NPC clonedNPC2 = prototypeNPC.cloneEntity();
        clonedNPC1 = new NPC("Goblin Warrior", "A stronger goblin with a sword.", 150, npcInventory);
        System.out.println("Original Room: " + prototypeRoom);
        System.out.println("Cloned Room 1: " + clonedRoom1);
        System.out.println("Cloned Room 2: " + clonedRoom2);
        System.out.println("Original NPC: " + prototypeNPC);
        System.out.println("Cloned NPC 1 (Modified): " + clonedNPC1);
        System.out.println("Cloned NPC 2: " + clonedNPC2);
    }
}
