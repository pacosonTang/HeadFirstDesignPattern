package com.research.alg2;

import static java.lang.System.out;

import java.util.Arrays;

import com.research.io2.PrintResult;
import com.research.pojo2.ClusterData;
import com.research.pojo2.ClusterParam;

public abstract class ClusterAlg {

	public static String algName;
	abstract int assign(int index); // 为 第 index 个item 分配质心，返回结果是质心编号index
	abstract void refine();// 精炼质心
	
	public final void cluster() {// 聚类方法
		
		randomRefineInitialCentroid(); // 随机初始化聚类质心
		for (int i = 0; i < ClusterParam.clusterExeTimes; i++) {
			Arrays.fill(ClusterData.clusterMemberNum, 0); // 清空聚类成员个数记录
			for (int j = 0; j < ClusterData.rowno; j++){  
				ClusterData.rownoWithClusterid[j] = assign(j);
			}
			clearDoubleArray(ClusterData.centroid); // 清空质心
			refine();
			PrintResult.print(i+1);
		}
	}

	// reset centroid array zeros
	final void clearIntArray(int[][] data) {
		for (int i = 0; i < data.length; i++)
			Arrays.fill(data[i], 0);
	}

	// reset centroid array zeros
	final void clearDoubleArray(double[][] data) {
		for (int i = 0; i < data.length; i++)
			Arrays.fill(data[i], 0);
	}
	
	// randomly update or refine init centroids
	final void randomRefineInitialCentroid() {
		
		int[] initCentorid = generateRandom(ClusterData.rowno, ClusterParam.clusterNum);

		System.out.println("====  init centroids are as follows：");
		for (int i = 0; i < initCentorid.length; i++){
			ClusterData.centroid[i] = ClusterData.items[initCentorid[i]].clone();
			out.printf("%-8s", "item" + initCentorid[i]);
		}
		out.printf("\n============================================================================\n");
	}

	/**
	 * fabricate random array
	 * @param volumn , random number upper limit
	 * @param interval , interval number and there is a random number in every interval
	 * @return a random array
	 */
	final int[] generateRandom(int volume, int interval) {
		
		int[] r_data = new int[interval];
		int intervalVolume = volume / interval;

		for (int i = 0; i < interval; i++) {
			int r = (int) (Math.random() * intervalVolume);
			r_data[i] = r + intervalVolume * i;
		}

//		 r_data[0] = 1;
//		 r_data[1] = 101;
//		 r_data[2] = 301;
//		 r_data[3] = 501;
//		 r_data[4] = 701;
//		 r_data[5] = 901;

		return r_data;
	}
}
