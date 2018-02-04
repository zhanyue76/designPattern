package com.songjy.written.sort;

/**
 * 冒泡排序,注意冒泡的次数，1<=n<length
 * @author songjy
 *
 */
public class MyBubbleSort {

	public static void main(String[] args) {
		int[] arrs = {15,9,0,47,5,6,41,23,9,8,1,6};
		bubbleSort(arrs);
		print(arrs);
	}

	public static void bubbleSort(int[] args){
		for(int i=1;i<args.length;i++){
			for(int j=0;j<args.length-i;j++){
				if(args[j]>args[j+1]){
					int temp = args[j];
					args[j] = args[j+1];
					args[j+1] = temp;
				}
			}
		}
	}
	
	
	public static void print(int[] ar){
		for(int i=0;i<ar.length;i++){
			System.out.print(ar[i]+",");
		}
	}
}
