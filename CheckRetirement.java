package Exception;

public class CheckRetirement {
	public static void main (String[]args) throws Retierment {
		int a=56;
		if(a>=60) {
			System.out.println(a+" is Eligible");
		}
		else {
			throw new Retierment(a+" is Not Eligible");
		}
	}

}
