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

    public abstract void feed();

    public abstract void water();

    public abstract void play();
}
