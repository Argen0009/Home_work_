public class Animal implements Printable {
    private String Name;
    private int Age;
    private Color Color;

    public Animal(String name, int Age,Color color) {
        this.Name = name;
        this.Age = Age;
        this.Color = color;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color color) {
        Color = color;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public void print() {

    }
}
