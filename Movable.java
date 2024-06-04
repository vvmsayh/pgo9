interface Moveable {
    void start();
    void stop();
}
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        if(name==null){
            throw new IllegalArgumentException("Name cannot be null!");
        }
        return name;
    }
}
class Cat extends Animal implements Moveable {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("Cat starts!");
    }

    @Override
    public void stop() {
        System.out.println("Cat stopped!");
    }
}