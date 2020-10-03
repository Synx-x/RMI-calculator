package rmi_calc;

// interface between calcClient and calcServer


import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculate extends Remote{
	public int add(int n1, int n2, int clientNo) throws RemoteException;
	public int subt(int n1, int n2, int clientNo) throws RemoteException;
	public int mult(int n1, int n2, int clientNo) throws RemoteException;
	public int div(int n1, int n2, int clientNo) throws RemoteException;
}
