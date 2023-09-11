public class Main {
    public static void main(String[] args) {
        Printable[] characters = new Printable[3];


        characters[0] = createObject("Dog");
        characters[1] = createObject("Tiger");
        characters[2] = createObject("Cat");

        for (Printable character : characters){
            character.print();
        }

    }
    public static Printable createObject (String className) {
        switch (className) {
            case "Dog":
                return new Dog("Bady",6,Color.ORANGE,2017,"voice");
            case "Tiger":
                return new Tiger("Bob",12,Color.WHITE,425.15,"Africa");
            case "Cat":
                return new Cat("Alisa",2,Color.BLACK,"Sccottish fold cat");
            default:
            throw new IllegalArgumentException("Unknown class: " + className);
        }
    }

}