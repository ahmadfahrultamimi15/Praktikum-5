public class Main {
        public static void main(String args[]) {

            Manager Riko = new Manager("RIKO",5000000,3000000);
            Programmer Andi = new Programmer("ANDI HERLAMBANG",8000000,5000000);

            System.out.println("Manager: ");
            System.out.println("=====================================");
            Riko.info();
            System.out.println();
            System.out.println("Programmer: ");
            System.out.println("=====================================");
            Andi.info();
            System.out.println();
        }
}
