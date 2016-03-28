package com.designpattern.chapter11_proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class CandyMachineProxyServer {
	public static void main(String[] args) throws RemoteException {
		CandyMachine machine = new CandyMachine("chengdu", 50);
		
		try {
			Naming.rebind("machine", machine);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
