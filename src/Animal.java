public class Animal implements Printable {
    private String Name;
    private int Age;
    public Animal(String name, int Age) {
        this.Name = name;
        this.Age = Age;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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
