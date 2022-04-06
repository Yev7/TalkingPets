public class Cat extends Pets{
    public Cat(String name, String animal) {
        super(name, animal);
    }

    @Override
    public void Sound() {
        System.out.println("meow");
    }

}
