package info.yodleeQA;
class Surendra
{
	public void name()
	{
		System.out.println("name is surendra");
	}
}
class Alaparthi extends Surendra
{
	public void name()
	{
		System.out.println("name is alaparthi");
	}	
	public void age()
	{
		System.out.println("alaparthi age is 100");
	}
}
public class Methodoverridinglogic {

	public static void main(String[] args) {
		Methodoverridinglogic logic=new Methodoverridinglogic();
		Surendra s=new Surendra();
		Surendra ss=new Alaparthi();
		Alaparthi a=new Alaparthi();
		//logic.print(s);
		//logic.print(s);
		logic.print(a);
	}
	public static void print(Alaparthi aa)
	{
		aa.name();
		aa.age();
	}

}
