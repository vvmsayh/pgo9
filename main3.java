// Main class to test the implementation
public class main3 {
    public static void main(String[] args) {
        BlackMamba s = new BlackMamba(22.5, 0.5, "Mamba");
        s.bite();
        s.start();
        System.out.println(s.getName());
        s.stop();
    }
}
