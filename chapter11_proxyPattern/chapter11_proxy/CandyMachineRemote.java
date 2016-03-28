package com.designpattern.chapter11_proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

// ����Զ�̷���ӿڣ��������ӿڣ�
public interface CandyMachineRemote extends Remote{
	int getCount() throws RemoteException;
	String getLocation() throws RemoteException;
	State getState() throws RemoteException;
}
