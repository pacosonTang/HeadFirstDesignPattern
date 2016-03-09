package com.research.pojo2;

import com.research.io2.DataRead;

public class ClusterPreparation {

	public final void prepare(String dir, double[][] items,
			double[][] centroid, int[] clusterMemberNum, int rowno,
			int dimension, int[] rwc, int clusterNum, int clusterExeTimes) {
		ClusterData.dir = dir;
		ClusterData.items = items;
		ClusterData.centroid = centroid;
		ClusterData.clusterMemberNum = clusterMemberNum;
		ClusterData.rowno = rowno;
		ClusterData.dimension = dimension;
		ClusterData.rownoWithClusterid = rwc;
		ClusterParam.clusterNum = clusterNum;
		ClusterParam.clusterExeTimes = clusterExeTimes;
	}
	
	public final void readData(){
		DataRead reader = new DataRead("rawTimeSeries.xlsx");
		reader.readDataToArray();
	}
}
