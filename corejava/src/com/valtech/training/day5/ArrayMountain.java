package com.valtech.training.day5;

public class ArrayMountain {

	public static void main(String[] args) {
			ArrayMountain am = new ArrayMountain();
			System.out.println(am.isMountain(4,5,3,2,1));
			System.out.println(am.isMountain(4,3,3,2,1));
			System.out.println(am.isMountain(6,5,3,2,1));
			System.out.println(am.isMountain(4,5,6,7,8));
			
	}

	private boolean isMountain(int ... i ) {
		int peak = identifypeak(i);
		if(peak == 0 || peak == i.length -1) return false;
		boolean asc = checkAscending(i,peak);
		boolean desc = checkDescending(i,peak);
		return asc && desc;
	}

	private boolean checkDescending(int[] i, int peak) {
		@SuppressWarnings("unused")
		boolean desc = true;
		for(int j=0;j<peak;j++) {
			if(i[j]<i[j+1]) {
				desc = false;
			}
		}
		return false;
	}

	private boolean checkAscending(int[] i,int peak) {
		@SuppressWarnings("unused")
		boolean asc = true;
		for(int j=0; j<peak; j++) {
			if(i[j]>i[j+1]) {
				return false;
			}
		}
		return false;
	}

	private int identifypeak(int[] i) {
		@SuppressWarnings("unused")
		int index=0;
		@SuppressWarnings("unused")
		int max=0;
		for(int j=0;j<i.length;j++) {
			if(i[j]>i[j+1]) {
				return j;
			}
		}
		return 0;
	}

}
