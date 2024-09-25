import java.util.Scanner;
public class testerInput {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("cd/dvd?");
        String pilihan = in.nextLine();

        System.out.println("name : ");
        String name = in.nextLine();
        System.out.println("number : ");
        int number = in.nextInt();
        System.out.println("quantity: ");
        int quantity = in.nextInt();
        System.out.println("price: ");
        double price = in.nextDouble();
        in.nextLine();
        if(pilihan.equals("cd")) {
            System.out.println("artist: ");
            String artist = in.nextLine();
            System.out.println("label: ");
            String label = in.nextLine();
            System.out.println("Total song: ");
            int numSong = in.nextInt();
            kelasCD c1 = new kelasCD(number, name, quantity, price, artist, numSong, label);
            c1.print();
        
         }else if (pilihan.equalsIgnoreCase("dvd")){
            System.out.println("Studio");
            String Studio = in.nextLine();
            System.out.println("Ratting");
            String Ratting = in.nextLine();
            System.out.println("Length");
            int Length = in.nextInt();


    }    
}
}