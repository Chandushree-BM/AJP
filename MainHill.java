import java.util.Scanner;

class HillStations {
    void location() {
        System.out.println("Location");
    }

    void famousFor() {
        System.out.println("Famous For");
    }
}

class Manali extends HillStations {
    void location() {
        System.out.println("Manali is in Himachal Pradesh");
    }

    void famousFor() {
        System.out.println("It is famous for Hadimba Temple and adventure sports");
    }
}

class Mussoorie extends HillStations {
    void location() {
        System.out.println("Mussoorie is in Uttarakhand");
    }

    void famousFor() {
        System.out.println("It is famous for education institutions");
    }
}

class Gulmarg extends HillStations {
    void location() {
        System.out.println("Gulmarg is in J&K");
    }

    void famousFor() {
        System.out.println("It is famous for skiing");
    }
}

public class MainHill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Hill Station: 1-Manali 2-Mussoorie 3-Gulmarg");
        int choice = sc.nextInt();

        HillStations h;

        if (choice == 1) {
            h = new Manali();
        } else if (choice == 2) {
            h = new Mussoorie();
        } else {
            h = new Gulmarg();
        }

        h.location();     // overridden method
        h.famousFor();    // overridden method

        sc.close();
    }
}
