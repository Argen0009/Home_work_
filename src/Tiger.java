public class Tiger extends Animal {
    private String WhereWasBorn;
    private double whole;

    public Tiger(String name, int Age,Color color, double whole, String whereWasBorn) {
        super(name, Age,color);
        this.whole = whole;
        WhereWasBorn = whereWasBorn;
    }

    public String getWhereWasBorn() {
        return WhereWasBorn;
    }

    public double getWhole() {
        return whole;
    }

    @Override
    public void print() {
        System.out.println("Where was born: " +WhereWasBorn+
                "\nColor: " + Color.WHITE+
                  "\nIt's weight is"+whole);
    }
}

