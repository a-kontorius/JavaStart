class Convert
{
	public static void main(String[] args)
	{
		float daysFloat = 365.25f;
		String weeksString = "52";

		int daysInt = (int) daysFloat;
		int weksInt = Integer.parseInt( weeksString );
		
		int week = (daysInt / weksInt);
		System.out.println("Дней в неделе: " + week);

	}
}