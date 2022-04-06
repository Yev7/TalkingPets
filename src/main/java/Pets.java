public abstract class Pets {
    private String name;
    public String animal;

    @Override
    public String toString() {
        return "Pets{" +
                "name='" + name + '\'' +
                ", animal='" + animal + '\'' +
                '}';
    }

    public Pets(String name, String animal) {
        this.name = name;
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public abstract void Sound();



}
