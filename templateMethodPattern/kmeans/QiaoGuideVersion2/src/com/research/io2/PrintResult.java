package com.research.io2;

import com.research.pojo2.ClusterData;
import com.research.pojo2.ClusterParam;

public class PrintResult {
	
	public final static void print(int round)
	{
		System.out.print("======" + round + " round result starts======");
		for (int i = 0; i < ClusterParam.clusterNum; i++) {
			System.out.print("\ncluster" + (i+1) + ": ");
			for (int j = 0; j < ClusterData.rowno; j++) {
				if(ClusterData.rownoWithClusterid[j] == i)
				{
					System.out.print(" item" + j);
				}
			}
		}
		System.out.println("\n======over======\n");
	}
}
