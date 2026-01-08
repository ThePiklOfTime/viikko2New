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
        System.out.println();
        System.out.print("Anna auton malli: ");
        String malli = scanner.nextLine();
        var car = new Car(brand, malli, 0);
        System.out.println();

        while (!exit) {
            System.out.println("1) Näytä auton tila, \n2) Muokkaa auton merkkiä ja mallia, \n3) Kiihdytä autoa, \n4) Hidasta autoa \n0) Lopeta ohjelma");
            
            
            if(scanner.hasNext()){
                int i = Integer.parseInt(scanner.nextLine());
            
            switch (i) {
                case 1:
                    car.status();
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