public class Dog extends Animal{
    private String team;
    private int YearOfBirth;

    public Dog(String name, int Age,Color color, int yearOfBirth, String team) {
        super(name, Age,color);
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
        System.out.println("Team"+ team +
                "\nColor: "+ Color.ORANGE+
                "\nYear of birth: "+YearOfBirth);
    }
}
