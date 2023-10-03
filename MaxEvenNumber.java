package Exception;

public class MaxEvenNumber throws Max {
	public int findMax(int[] a) {
		int max=a[1];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]){
				max=a[i];
			}
		}
		if(max%2==0) {
			return max;
		}
		else {
			throw
		}
	}

}
