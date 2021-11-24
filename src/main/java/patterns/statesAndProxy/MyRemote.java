package main.java.patterns.statesAndProxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {
    // результат функции должен быть сериализуемым т.к. передается по сети
    public String sayHello() throws RemoteException;
}
