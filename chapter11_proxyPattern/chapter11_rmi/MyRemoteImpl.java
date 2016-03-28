package com.designpattern.chapter11_rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// 制作远程实现
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{

	private static final long serialVersionUID = 2494818195984623711L;

	protected MyRemoteImpl() throws RemoteException {
		super();
	}

	@Override
	public String sayHello() throws RemoteException {
		
		return "every body say, xiao tang tang";
	}
	
	public static void main(String[] args) {
		try {
			MyRemote service = new MyRemoteImpl();
			Naming.rebind("hehe", service);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
