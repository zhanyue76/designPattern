package com.songjy.written.sort;

public class HeapSort {

	
	public static void main(String[] args){
		int[] arrs = {15,9,0,47,5,6,41,23,9,8,1,6};
		buildHeap(arrs);
		print(arrs);
	}
	
	
	public static void print(int[] ar){
		for(int i=0;i<ar.length;i++){
			System.out.print(ar[i]+",");
		}
	}
	
	private static void buildHeap(int[] arrs){
		for(int i=arrs.length/2;i>0;i--){
			percolateDown(i,arrs,arrs.length);
		}
	}
	
	/**
	 * 下沉渗透
	 * @param hole 渗透节点
	 * @param arrs 数组
	 * @param arrslength 数组长度
	 */
	private static void percolateDown(int hole,int[] arrs,int arrslength){
		int child;
		for(;hole*2<=arrslength;hole=child){
			child=hole*2;
			if(child+1<=arrslength && arrs[child+1-1]<arrs[child-1]){
				child++;
			}
			if(arrs[child-1]<arrs[hole-1]){
				int temp = arrs[hole-1];
				arrs[hole-1]=arrs[child-1];
				arrs[child-1]=temp;
			}else
				break;
		}
	}
}
