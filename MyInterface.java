import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {

   
    double lireSolde(String str) throws RemoteException;
    double debiter(double n,double d) throws RemoteException;
    double crediter(double n,double c) throws RemoteException;
}
