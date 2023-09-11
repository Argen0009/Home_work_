public class Tiger extends Animal {
    private String WhereWasBorn;
    private double whole;

    public Tiger(String name, int Age, double whole, String whereWasBorn) {
        super(name, Age);
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
        System.out.println(" Tiger:"+getName() +" Age:"+getAge() +" Where was born:" +getWhereWasBorn()+
                  "It's weight is :"+getWhole());
    }
}

