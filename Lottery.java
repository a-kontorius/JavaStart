class Lottery
{
	public static void main(String[] args)
	{
		int[] nums = new int[50];
		int i;

		for(i = 1; i < 50; i++) { nums[i] = i; }
		for(i = 1; i < 50; i++)
		{
			int r = (int) Math.ceil(Math.random() * 49);
			int temp = nums[i];
			nums[i] = nums[r];
			nums[r] = temp;
		}
		for(i = 1; i < 7; i++)
			System.out.print(Integer.toString(nums[i]) + " ");
	}
}