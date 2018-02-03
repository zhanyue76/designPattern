package com.songjy.written.sort;
/**
 * 快速排序
 * @author songjy
 *
 */
public class MyQuickSort {

	public static void sort(int[] arrs,int begin,int end){
		if(begin>=end) return;
		int left = begin;
		int right = end;
		int index = arrs[left];
		while(left<right){
			while(left<right && arrs[right]>index){
				right--;
			}
			if(left<right){
				arrs[left]=arrs[right];
				left++;
			}
			while(left<right&&arrs[left]<index){
				left++;
			}
			if(left<right){
				arrs[right]=arrs[left];
				right--;
			}
		}
		arrs[left]=index;
		sort(arrs,begin,left-1);
		sort(arrs,left+1,end);
		
	}
	
	public static void print(int[] ar){
		for(int i=0;i<ar.length;i++){
			System.out.print(ar[i]+",");
		}
	}
	
	public static void main(String[] args) {
		int[] arrs = {15,22,13,9,16,33,15,23,18,4,33,25,14};
		sort(arrs,0,arrs.length-1);
		print(arrs);
	}

}
