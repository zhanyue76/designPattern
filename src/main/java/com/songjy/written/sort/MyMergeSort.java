package com.songjy.written.sort;

/**
 * 归并排序
 * @author songjy
 *
 */
public class MyMergeSort {

	public static void main(String[] args) {
		int[] arrs = {15,9,0,47,5,6,41,23,9,8,1,6};
		mergesort(arrs,0,arrs.length-1);
		print(arrs);
	}
	
	public static void print(int[] ar){
		for(int i=0;i<ar.length;i++){
			System.out.print(ar[i]+",");
		}
	}
	
	public static void mergesort(int[] arrs,int left,int right){
		if(right<=left)
			return;
		int middle = (left+right)/2;
		mergesort(arrs,left,middle);
		mergesort(arrs,middle+1,right);
		//merge(arrs,left,middle,right);
		merger_1(arrs,left,right);
		
	}
	
	public static void merge(int[] arrs,int left,int middle,int right){
		
		int[] temp = new int[right-left+1];
		int i=left;
		int j=middle+1;
		int k=0;
		while(i<=middle&&j<=right){
			if(arrs[i]<=arrs[j]){
				temp[k++]=arrs[i];
				i++;
			}else{
				temp[k++]=arrs[j];
				j++;
			}
		}
		
		while(i<=middle){
			temp[k++] = arrs[i++];
		}
		while((j)<=right){
			temp[k++] = arrs[j++];
		}
		
		for(int m=0;m<temp.length;m++){
			arrs[left+m] = temp[m];
		}
		
	}
	
	public static void merger_1(int[] arrs,int left,int right){
		int middle = (left+right)/2;
		int k=0;
		int[] temp = new int[right-left+1];
		int L= left;
		int R = middle+1;
		while(L<=middle && R<=right){
			if(arrs[L]<=arrs[R]){
				temp[k]=arrs[L];
				L++;
				k++;
			}else{
				temp[k]=arrs[R];
				R++;
				k++;
			}
		}
		
		while(L<=middle){
			temp[k++]=arrs[L];
			L++;
		}
		
		while(R<=right){
			temp[k++]=arrs[R];
			R++;
		}
		int index=left;
		for(int i=0;i<temp.length;i++){
			arrs[index+i] = temp[i];
		}
		
	}

}
