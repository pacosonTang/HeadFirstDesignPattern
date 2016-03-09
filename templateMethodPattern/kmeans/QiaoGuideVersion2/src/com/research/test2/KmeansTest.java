package com.research.test2;

import com.research.alg2.ClusterAlg;
import com.research.alg2.KmeansAlg;
import com.research.pojo2.ClusterParam;
import com.research.pojo2.ClusterPreparation;

public class KmeansTest {

	public static void main(String[] args) {

		String dir = "E:\\bench-cluster\\cloud-data-preprocess\\QiaoGuideVersion2\\sourceAndResult\\";
		ClusterPreparation pre = new ClusterPreparation();

		pre.prepare(dir, // dir
				new double[1000][128], // items
				new double[6][128], // centroid
				new int[6], // clusterMemberNum
				1000, // rowno
				128, // dimension
				new int[1000], // rwc
				6, // clusterNum
				6); // clusterExeTimes
		pre.readData();
		ClusterAlg alg = new KmeansAlg();
		alg.cluster();
	}
}
