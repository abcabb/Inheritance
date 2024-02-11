public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog(String type, String size, int weight){
        super(type, size, weight);
    }

    public Dog(String type, int weight, String earShape, String tailShape) {
        super(type, weight<15 ? "Small" : (weight<30 ? "Medium" : "Huge"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public Dog(String type, int weight){
        this(type, weight, "Small Ear", "Small Tail");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makeNoise() {
        if(type == "wolf"){
            System.out.println("Who Hooooooo");
        }else {
            bark();
        }
        super.makeNoise();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dog walks, runs and tails.");
        if(speed == "slow"){
            walk();
            wagTail();
        }else{
            run();
            bark();
        }
    }

    public void bark(){
        System.out.print("Woof ! ");
    }
    public void run(){
        System.out.print("Dog runs ");
    }
    public void walk(){
        System.out.print("Dog walks ");
    }
    public void wagTail(){
        System.out.print("Wagging tail ");
    }
}
