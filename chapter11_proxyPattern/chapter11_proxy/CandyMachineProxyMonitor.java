package com.designpattern.chapter11_proxy;

public class CandyMachineProxyMonitor {
	CandyMachineRemote remoteMachine;
	
	public CandyMachineProxyMonitor(CandyMachineRemote remoteMachine) {
		this.remoteMachine = remoteMachine;
	}
	
	public void report() {
		int counter = 0;
		
		try {
			while(true) {
				System.out.println("round" + (++counter));
				System.out.println("machine.location = " + remoteMachine.getLocation());
				System.out.println("machine.count = " + remoteMachine.getCount());
				System.out.println("machine.state = " + remoteMachine.getState());
				if(counter == 5) {
					break;
				}
				Thread.sleep(10000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
