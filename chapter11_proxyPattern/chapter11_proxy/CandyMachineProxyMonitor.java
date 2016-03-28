package com.designpattern.chapter11_proxy;

public class CandyMachineProxyMonitor {
	CandyMachineRemote remoteMachine;
	
	public CandyMachineProxyMonitor(CandyMachineRemote remoteMachine) {
		this.remoteMachine = remoteMachine;
	}
	
	public void report() {
		try {
			System.out.println("machine.location = " + remoteMachine.getLocation());
			System.out.println("machine.count = " + remoteMachine.getCount());
			System.out.println("machine.state = " + remoteMachine.getState());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
