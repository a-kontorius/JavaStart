class Escape
{
	public static void main(String[] args)
	{
		String header = "\n\tНЬЮ-ЙОРК ПРОГНОЗ НА 3 ДНЯ:\n";
		header += "\n\tДень\t\tМакс\tМин\tОсадки\n";
		header += "\t----\t\t-----\t----\t-----------\n";

		String forecast = "\tВоскресенье\t68F\t48F\tЯсно\n";
		forecast += "\tПонедельник\t69F\t50F\tОблачность\n";
		forecast += "\tВторник\t\t70F\t50F\tОблачность\n";

		System.out.println(header + forecast);
	}
}