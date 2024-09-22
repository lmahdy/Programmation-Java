public class Zoo {
    // Attributes
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    // Constructor
    public Zoo(String name, String city, int nbrCages, int maxAnimals) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[maxAnimals];
    }
}
