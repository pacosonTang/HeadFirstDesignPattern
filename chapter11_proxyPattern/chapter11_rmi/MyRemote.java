package com.designpattern.chapter11_rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

// ����Զ�̽ӿ�, �������еķ��������׳�  RemoteException
public interface MyRemote extends Remote{
	// ȷ�������ͷ���ֵ������ԭ�����ͻ�����л�����
	// String ���;��ǿ����л���
	public String sayHello() throws RemoteException;
}
