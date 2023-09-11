public class Cat extends Animal {
    private String breed;
    public Cat(String name, int Age , String breed) {
        super(name, Age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void print() {
        System.out.println( " Cat:"+getName()+" Age:"+getAge()+" Breed:"+ getBreed());
    }
}
