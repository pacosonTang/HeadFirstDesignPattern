package com.research.alg2;

import static java.lang.Math.pow;

import com.research.pojo2.ClusterData;
import com.research.pojo2.ClusterParam;

public class KmeansAlg extends ClusterAlg {

	/**
	 * compute the centroid the item should be assigned to
	 * @param index refers to item index
	 * @return cluster id whose has the smallest distance between centroid and
	 *         the item
	 */
	@Override
	int assign(int index) {

		double sum = 0;
		double miniSum = 0;
		int miniIndex = 0;
		double[] item = ClusterData.items[index];

		for (int i = 0; i < ClusterData.dimension; i++)
			sum += pow(item[i] - ClusterData.centroid[0][i], 2.0);

		miniSum = sum;
		for (int i = 1; i < ClusterParam.clusterNum; i++) {
			sum = 0;
			for (int j = 0; j < ClusterData.dimension; j++)
				sum += Math.pow(item[j] - ClusterData.centroid[i][j], 2.0);
			if (miniSum > sum) {
				miniSum = sum;
				miniIndex = i;
			}
		}
		ClusterData.clusterMemberNum[miniIndex]++;

		return miniIndex;
	}

	@Override
	void refine() {

		int clusterId;

		for (int i = 0; i < ClusterData.rowno; i++) {
			clusterId = ClusterData.rownoWithClusterid[i];
			for (int j = 0; j < ClusterData.dimension; j++)
				ClusterData.centroid[clusterId][j] += ClusterData.items[i][j];
		}
		// update centroids(refinement procedure)
		for (int i = 0; i < ClusterParam.clusterNum; i++)
			for (int j = 0; j < ClusterData.dimension; j++)
				ClusterData.centroid[i][j] /= ClusterData.clusterMemberNum[i];
	}
}
