
class VarArgs2
{

	public static void m1(int i,int j)
	{
		System.out.println("M1(int i,int j): "+i+","+j);
	}

	public static void m1(int ... a)
	{
		System.out.println(a[0]+","+a[1]+","+a[2]);
		return;

	}

	public static void main(String[] args) {
		
		m1(10,20);
		m1(30,40,50);
		//m1();
	}
}