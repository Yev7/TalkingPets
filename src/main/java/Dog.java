public class Dog extends Pets{
    public Dog(String name, String animal) {
        super(name, animal);
    }

    @Override
    public void Sound() {
        System.out.println("woof");
    }
}