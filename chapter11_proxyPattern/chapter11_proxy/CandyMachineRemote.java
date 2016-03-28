package com.designpattern.chapter11_proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

// 创建远程服务接口（服务器接口）
public interface CandyMachineRemote extends Remote{
	int getCount() throws RemoteException;
	String getLocation() throws RemoteException;
	State getState() throws RemoteException;
}
