package com.songjy.written.sort;

public class MyInsertSort {

	public static void main(String[] args) {
		int[] arrs = {15,9,0,47,5,6,41,23,9,8,1,6};
		insertSort_1(arrs);
		print(arrs);
	}
	
	public static void print(int[] ar){
		for(int i=0;i<ar.length;i++){
			System.out.print(ar[i]+",");
		}
	}
	
	public static void insertSort(int[] arrs){
		//从第二个选择开始
		for(int i=1;i<arrs.length;i++){
			int target = arrs[i];
			int index = i;
			while(index>0&&arrs[index-1]<target){
				arrs[index] = arrs[index-1];
				index--;
			}
			arrs[index]=target;
			
		}
	}
	
	
	public static void insertSort_1(int[] arrs){
		//从第二个选择开始
		for(int i=1;i<arrs.length;i++){
			int j=i;
			int target = arrs[j];
			while(j>0&&target<arrs[j-1]){
				arrs[j]=arrs[j-1];
				j--;
			}
			arrs[j]=target;
		}
	}

}
