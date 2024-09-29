import java.util.Scanner;

public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {

        ZooManagement zooManagement = new ZooManagement();


        System.out.println(zooManagement.zooName + " comporte " + zooManagement.nbrCages + " cages");


        Scanner scanner = new Scanner(System.in);


        System.out.print("Entrez le nom du zoo : ");
        zooManagement.zooName = scanner.nextLine();

        System.out.print("Entrez le nombre de cages : ");
        while (!scanner.hasNextInt()) {
            System.out.print("Veuillez entrer un nombre valide : ");
            scanner.next();
        }
        zooManagement.nbrCages = scanner.nextInt();
        scanner.nextLine();  // Consume the newline left-over


        Zoo myZoo = new Zoo(zooManagement.zooName, "CityName", zooManagement.nbrCages, 25);


        Animal lion = new Animal("Felidae", "Lion", 5, true);


        myZoo.animals[0] = lion;


        System.out.println(myZoo.name + " comporte " + myZoo.nbrCages + " cages");


        System.out.println("Animal dans le zoo: " + myZoo.animals[0]);


        System.out.println(lion);


        scanner.close();
    }
}
