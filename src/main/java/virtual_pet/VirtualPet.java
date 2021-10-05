package virtual_pet;

public abstract class VirtualPet {
    private String name;
    private String description;

    // constructor

    public VirtualPet(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public abstract void energize();

    public abstract void fluid();

    public abstract void playPet();

    public abstract void tick();

    public String getPetByDescription() {
        return description;
    }
    public String getPetString() {
        return String.format("pet: %-20s%-10d",name, 5);
    }
}

