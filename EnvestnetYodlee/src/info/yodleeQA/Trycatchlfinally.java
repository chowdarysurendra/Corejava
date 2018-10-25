package info.yodleeQA;

public class Trycatchlfinally {

	public static void main(String[] args) {
		int [] array= {1,5,4,6};
		try
		{
			int n=array[4];
			System.out.println(n);
		}
		/*catch(ArrayIndexOutOfBoundsException ee)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
			ee.printStackTrace();
		}*/
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("exception handled");
		}
		finally
		{
			System.out.println("finally block executed");
		}
       System.out.println("surendra alaparthi");
	}

}
