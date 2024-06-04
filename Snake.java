interface Poisonous{
    void bite();
}
abstract class Snake {
    private double length;
    private double mass;
    private String name;

    public Snake(double length, double mass, String name) {
        this.length = length;
        this.mass = mass;
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public double getMass() {
        return mass;
    }

    public String getName() {
        return name;
    }
}
class BlackMamba extends Snake implements Poisonous, Moveable {

    public BlackMamba(double length, double mass, String name) {
        super(length, mass, name);
    }

    @Override
    public void bite() {
        System.out.println(super.getName() + " bites!");
    }

    @Override
    public void start() {
        System.out.println(super.getName() + " starts!");
    }

    @Override
    public void stop() {
        System.out.println(super.getName() + " stopped!");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
