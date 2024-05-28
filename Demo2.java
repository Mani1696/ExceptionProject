package Exception;

public class Demo2 {
 public static void main (String[]args) {
//	 String a="Bala";
//	 try {
//	 char b=a.charAt(5);
//	 System.out.println(b);
//	 char[] c=a.toCharArray();
//	 System.out.println(c[5]);
//	 }
//	 catch(StringIndexOutOfBoundsException e) {
//		 System.out.println(e);
//	 }
//	 catch(ArrayIndexOutOfBoundsException f) {
//		 System.out.println(f);
//	 }
	 
	 String[] word= {"sekar","bala","Agasthiya","Mani"};
	 try {
	 System.out.println(Integer.parseInt(word[2]));
	 }
	 catch(StringIndexOutOfBoundsException a) {
		 System.out.println(a);
	 }
	 catch(IndexOutOfBoundsException b) {
		 System.out.println(b) ;
	 }
	 catch(Exception c) {
		 System.out.println(c);
	 }
 }
}
