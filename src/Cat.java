public class Cat extends Animal {
    private String breed;
    public Cat(String name, int Age,Color color, String breed) {
        super(name, Age,color);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void print() {
        System.out.println("Breed: "+breed+
                "\nColor: " + Color.BLACK);
    }
}
