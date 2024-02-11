public class Fish extends Animal{
    private int gills;
    private int fins;

    public Fish(String type, int weight, int gills, int fins){
        super(type, "Small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles(){
        System.out.print("Muscles moving ");
    }

    private void moveBackFin(){
        System.out.print("Back fin moving ");
    }

    @Override
    public void makeNoise(){
        super.makeNoise();
        System.out.println("Bloop, blup !");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed == "fast")
            moveBackFin();
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
