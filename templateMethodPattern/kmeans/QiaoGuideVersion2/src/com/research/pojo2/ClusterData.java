package com.research.pojo2;

public class ClusterData {
	
	public static String dir;  // 源数据和结果数据存取路径
	public static double[][] items; // 暂存数据的二维数组 
	public static double[][] centroid; //暂存数据的聚类质心
	public static int[] clusterMemberNum; // 每个聚类中的成员个数
	public static int rowno; // 数据行数
	public static int dimension; // 数据维度
	public static int[] rownoWithClusterid; // item 行号 对应 的 clusterid 标识
}
