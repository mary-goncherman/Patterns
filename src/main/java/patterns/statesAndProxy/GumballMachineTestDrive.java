package main.java.patterns.statesAndProxy;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class GumballMachineTestDrive {

    public static void main(String[] args) throws RemoteException {
        GumballMachineRemote gumballMachine = null;
        int count;

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }
        try {
            count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(count, args[0]);
            Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //GumballMonitor monitor = new GumballMonitor(gumballMachine);
        //monitor.report();

//        GumballMachine gumballMachine = new GumballMachine(5, "67 Ignatova st.");
//
//        System.out.println(gumballMachine);
//
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//
//        System.out.println(gumballMachine);
//
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//
//        System.out.println(gumballMachine);

    }
}
