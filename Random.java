class Random
{
	public static void main(String[] args)
	{
		float random = (float) Math.random();
		float multiplied = random * 10;
		int randomInt = (int) Math.ceil(multiplied);

		System.out.println("Случайное число: " + random);
		System.out.println("Умноженное на 10: " + multiplied);
		System.out.println("Случайное число: " + randomInt);
	}
}