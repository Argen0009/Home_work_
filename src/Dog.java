public class Dog extends Animal{
    private String team;
    private int YearOfBirth;

    public Dog(String name, int Age , int yearOfBirth, String team) {
        super(name, Age);
        this.YearOfBirth = yearOfBirth;
        this.team = team;

    }

    public String getTeam() {
        return team;
    }

    public int getYearOfBirth() {
        return YearOfBirth;
    }

    @Override
    public void print() {
        System.out.println(" Dog:"+getName()+" Age:"+getAge()+" YearOfBirth:"+ getYearOfBirth()+" Team:"+getTeam());
    }
}
