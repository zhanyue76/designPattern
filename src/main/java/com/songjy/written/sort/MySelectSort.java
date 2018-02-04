package com.songjy.written.sort;

/**
 * 选择排序，基本思想如下，从第一个开始算，从左到右找到最小的那个编号，然后与第一个交换，然后再从第二个继续上升操作,依次类推
 * @author songjy
 *
 */
public class MySelectSort {

	public static void main(String[] args) {
		int[] arrs = {15,9,0,47,5,6,41,23,9,8,1,6};
		selectSort(arrs);
		print(arrs);
	}
	
	public static void print(int[] ar){
		for(int i=0;i<ar.length;i++){
			System.out.print(ar[i]+",");
		}
	}
	public static void selectSort(int[] arrs){
		
		for(int i=0;i<arrs.length-1;i++){
					
			int selectedId = i;//被比较ID
			int selectedValue=arrs[selectedId];//被比较值
			
			//j为异动标尺
			int j=i+1;
			while(j<arrs.length){
				if(selectedValue>arrs[j]){
					selectedId = j;
					selectedValue=arrs[j];
				}
				j++;
			}
			if(i!=selectedId){
				arrs[selectedId] = arrs[i];
				arrs[i] = selectedValue;
			}
		}
	}

}
