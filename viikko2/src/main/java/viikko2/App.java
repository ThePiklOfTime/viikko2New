package viikko2;

import java.util.Scanner;
//katsoin viikon 2 lähdekoodia selvittääkseni javan syntaxia
public class App 
{
    public static void main( String[] args )
    {
        Boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Anna auton merkki: ");
        String brand = scanner.nextLine();

        System.out.print("Anna auton malli: ");
        String malli = scanner.nextLine();
        var car = new Car(brand, malli, 0);


        while (!exit) {
            System.out.println("1) Näytä auton tila \n2) Muokkaa auton merkkiä ja mallia \n3) Kiihdytä autoa \n4) Hidasta autoa \n0) Lopeta ohjelma");
            
            
            if(scanner.hasNext()){
                int i = Integer.parseInt(scanner.nextLine());
            
            switch (i) {
                case 1:
                    car.status();
                    break;
                case 2:
                    System.out.print("Anna uusi auton merkki: ");
                    String uusimerkki = scanner.nextLine();
                    System.out.print("Anna uusi auton malli: ");
                    String uusimalli = scanner.nextLine();
                    car.brand = uusimerkki;
                    car.model = uusimalli;
                    break;
                case 3:
                    System.out.print("Kuinka monta km/h haluat kiihdyttää? ");
                    int kiihdytys = Integer.parseInt(scanner.nextLine());
                    if (kiihdytys < 0) {
                        System.out.println("Nopeuden täytyy olla positiivinen luku.");
                        break;
                    }
                    car.Kiihdytä(kiihdytys);
                    break;
                case 0:
                    exit = true;
                    break;
                
                default:
                    System.out.println("Syöte oli väärä");
                    break;
            
            
                }
        }
    }
    System.out.println("Kiitos ohjelman käytöstä.");
    scanner.close();
    }
}