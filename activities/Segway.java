public class Segway extends Transportation {

    private int coolFactor;
    
    public Segway(int coolFactor) {
        super(2, 15, 1);
        this.coolFactor = coolFactor;
    }

    public static void main(String[] args) {
        Segway suave = new Segway(9001);
        System.out.println(suave.topSpeed);
    }

}
