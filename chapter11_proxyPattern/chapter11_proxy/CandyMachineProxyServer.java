package com.designpattern.chapter11_proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

import com.designpattern.chapter11_proxy.CandyMachine;

public class CandyMachineProxyServer {
	public static void main(String[] args) throws RemoteException {
		CandyMachine machine = new CandyMachine("chengdu", 50);
		
		try {
			Naming.rebind("machine", machine);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		new Thread(new Runnable() { // 开启一个线程实现client循环投币
			@Override
			public void run() {
				System.out.println("\n\n ====== 下面进入循环测试（中奖率为20%） ======");
				for (int i = 0; i < 5; i++) {
					machine.insertQuarter();
					machine.turnCrank();
					System.out.println(machine);
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();;
	}
}
