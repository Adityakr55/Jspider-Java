class Basic1
{
	public static void m(int i)
	{
		if(i == 4)return;
		System.out.print(i+" ");
		m(i+1);
		System.out.print(i+" ");
		m(i+1);
		System.out.print(i+" ");
		m(i+1);
	}

	public static void main(String[] args) {
		m(1);
	}
}