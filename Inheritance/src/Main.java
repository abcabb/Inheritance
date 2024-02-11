public class Main {
    public static void main(String[] args){
        Animal bear = new Animal("Bear", "Huge", 1000);
        doAnimalStuff(bear, "Fast");

        Dog kopke = new Dog("Canis", "Average", 80);
        doAnimalStuff(kopke, "Stupid");

        Dog kopke2 = new Dog("Retriever", 17, "Big ear", "Long tail");
        doAnimalStuff(kopke2 , "fast");

        Dog kopke3 = new Dog("Retriever", 24);
        doAnimalStuff(kopke3, "slow");

        Dog kopke4 = new Dog("wolf", 45);
        doAnimalStuff(kopke4, "fast");

        Fish fish1 = new Fish("GoldFish", 1, 4, 2);
        doAnimalStuff(fish1, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_______");
    }
}
