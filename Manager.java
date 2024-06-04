public class Manager extends Employee{
    private boolean Bonus_field;

    public boolean isBonus_field() {
        return Bonus_field;
    }

    public void setBonus_field(boolean bonus_field) {
        Bonus_field = bonus_field;
    }

    public Manager(String name, String SecondName,int hireDate, String companyName, int salarie_Fields, boolean Bonus_field) {
        super(name, SecondName, hireDate, companyName, salarie_Fields);
    }
    @Override
    public void bite() {
        System.out.println(super.getName() + " bites!");
    }

}
