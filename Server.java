import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements MyInterface {

    
    public Server() throws RemoteException {}


    
    public double lireSolde(String ch){
        return Double.parseDouble(ch);
    }
    
    public double debiter(double s, double d){
        return s-d;
    }
    
    public double crediter(double s, double c){
        return s+c;
    }

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();

        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }
}
