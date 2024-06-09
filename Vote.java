package Exception;

public class Vote {
	public static void main (String[]args) throws VoteNotEligible {
		int a=16;
		if(a>=20) {
			System.out.println("Eligble for vote");
		}
		else {
		 throw new VoteNotEligible("Not eligible for vote");
		}
	}
}
