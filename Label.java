class Label
{
	public static void main(String[] args)
	{
		otherLoop : for (int i=1; i < 4; i++)
			for(int j = 1; j < 4; j++)
			{
				if (i == 1 && j == 1)
				{
					System.out.println("otherLoop prodolgit rabotu pri i="+i+" j="+j);
					continue otherLoop;
				}
				if (i == 2 && j ==3)
				{
					System.out.println("Vyhod is otherLoop pri i="+i+" j="+j);
					break otherLoop;
				}
				System.out.println("Iteraciya i="+i+" j="+j);
			}
	}
}