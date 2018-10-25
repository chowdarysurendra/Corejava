package info.yodleeQA;

public class Booleanlogic {

	public static void main(String[] args) {
		Boolean b1=new Boolean("TRUE");
		Boolean b2 = new Boolean("True");
		Boolean b3 = new Boolean("tRue");
		Boolean b4 = new Boolean("false");
		Boolean b5 = new Boolean("TRUE");
		Boolean b6=b1;
		
		System.out.println(b1==b2);
		System.out.println(b1==b5);
		System.out.println(b1==b6);
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b3));
		System.out.println(b1.equals(b4));
		System.out.println(b1.equals(b5));
		/*if(b1==b2)
		{
			System.out.println("surendra");
		}
		if(b1.equals(b2))
		{
			System.out.println("yes surendra");
		}*/

	}

}
