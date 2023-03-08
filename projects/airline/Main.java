import java.util.Arrays;

public class Main {
  
    public static void main(String[] args) {

        Person[] peopleOnAirline = new Person[] { 
          new Person("Cleo", "Egypt", "69 BC", 1),
          new Person("Juliusr", "Rome", "100 BC", 2),
          new Person("Alexander", "Macedon", "356 BC", 3),
          new Person("Baal", "Carthage", "247 BC", 4),
          new Person("Confucius", "China", "551 BC", 5),
          new Person("Pericles", "Greece", "429 BC", 6),
          new Person("Sparta", "Thrace", "111 BC", 7),
          new Person("Marcus", "Rome", "121 AD", 8),
          new Person("Leonidas", "Greece", "540 BC", 9),
          new Person("Tzu", "China", "544 BC", 10),
          new Person("Ham", "Babylon", "1750 BC", 10),
        };

        Airline airline = new Airline();

        for (int i = 0; i < people.length; i++) {
            boolean passportApproved1 = people[i].applyPassport();
            if (passportApproved1) {
                people[i].setPassport();
                airline.createReservation(people[i]);
            } else {
                System.out.println("Sorry " + people[i].getName() + ". Your passport: " + Arrays.toString(people[i].getPassport()) + " is not valid.\n");  
            }
        }

     }
    
  
}
