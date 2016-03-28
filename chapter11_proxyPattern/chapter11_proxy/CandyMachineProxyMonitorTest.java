package com.designpattern.chapter11_proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

//client
public class CandyMachineProxyMonitorTest {
	public static void main(String[] args) throws RemoteException {
		CandyMachineRemote remoteMachine;
		try {
			remoteMachine = (CandyMachineRemote) Naming.lookup("rmi://127.0.0.1/machine");
			CandyMachineProxyMonitor monitor = new CandyMachineProxyMonitor(remoteMachine);
			monitor.report();
		} catch (MalformedURLException | NotBoundException e) {
			e.printStackTrace();
		}
	}
}
