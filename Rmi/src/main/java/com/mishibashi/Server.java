package com.mishibashi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements Hello{
    private static final long serialVersionUID = 1L;

    public Server() throws RemoteException{}

    public String sayHello(){
        return "Hello, world!";
    }

    public static void main(String args[]){
        try{
            Server obj = new Server();
            Naming.rebind("Hello", obj);

            System.err.println("Server ready");
        }
        catch(Exception e){
            System.err.println("Server exception:" + e.toString());
            e.printStackTrace();
        }
    }
}
