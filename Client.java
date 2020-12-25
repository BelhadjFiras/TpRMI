import java.rmi.Naming;
import java.util.Scanner;


public class Client {

    public static void main(String[] args) {
        try {
            MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Solde = ");
            String ch = scanner.nextLine();
            double s=service1.lireSolde(ch);
            
            System.out.println("Débiter :");
            ch = scanner.nextLine();
            double d = Double.parseDouble(ch);
            System.out.println("Nouveau solde :"); 
            s=service1.debiter(s,d);
            System.out.println(s);
            
            System.out.println("Créditer :");
            ch = scanner.nextLine();
            double c = Double.parseDouble(ch);
            System.out.println("Nouveau solde :");  
            s=service1.crediter(s,c);          
            System.out.println(s);

        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.toString());
        }
    }

}