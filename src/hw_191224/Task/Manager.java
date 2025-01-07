package hw_191224.Task;

public class Manager extends Employee{
    private  int teamSize;
    private double bonus;

    public Manager() {
    }

    public Manager(int id, String name, String email, String position, double salary, int teamSize, double bonus) {
        super(id, name, email, position, salary);
        this.teamSize = teamSize;
        this.bonus = bonus;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager{" + "teamSize=" + teamSize + ", bonus=" + bonus + "} " + super.toString();
    }
}
