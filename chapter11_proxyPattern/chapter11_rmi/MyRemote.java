package com.designpattern.chapter11_rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

// 制作远程接口, 声明所有的方法都会抛出  RemoteException
public interface MyRemote extends Remote{
	// 确定变量和返回值是属于原语类型或可序列化类型
	// String 类型就是可序列化的
	public String sayHello() throws RemoteException;
}
