public class ZooTest
{
	public void testGetTotalHeight() throws AssertException
	{
		Animal ani1 = new Animal("blue", "tiger", 20.0, 20.0);
		Animal ani2 = new Animal("red", "duck", 10.0, 10.0);
		Animal ani3 = new Animal("green", "godzilla", 5.0, 5.0);
		Zoo zoo1 = new Zoo(1);
		double expected = 35.0;
		zoo1.addAnimal(ani1);
		zoo1.addAnimal(ani2);
		zoo1.addAnimal(ani3);
		double actual = zoo1.getTotalHeight();
		Assert.assertEquals(expected, actual);
	}
	public void testsGetCapacity() throws AssertException
	{
		Animal ani1 = new Animal("blue", "tiger", 20.0, 20.0);
		Animal ani2 = new Animal("red", "duck", 10.0, 10.0);
		Animal ani3 = new Animal("green", "godzilla", 5.0, 5.0);
		Zoo zoo1 = new Zoo(1);
		zoo1.addAnimal(ani1);
		zoo1.addAnimal(ani2);
		zoo1.addAnimal(ani3);
		int expected = 4;
		int actual = zoo1.getCapacity();
		Assert.assertEquals(expected, actual);
	}
	public void testsToString() throws AssertException
	{
		Animal ani1 = new Animal("blue", "tiger", 20.0, 20.0);
		Animal ani2 = new Animal("red", "duck", 10.0, 10.0);
		Animal ani3 = new Animal("green", "godzilla", 5.0, 5.0);
		Zoo zoo1 = new Zoo(1);
		zoo1.addAnimal(ani1);
		zoo1.addAnimal(ani2);
		zoo1.addAnimal(ani3);
		String expected = "These animals live in the zoo: \n" + "tiger, a blue-colored animal. 20.0 pounds, 20.0 inches\n"
				+ "duck, a red-colored animal. 10.0 pounds, 10.0 inches\n" + "godzilla, a green-colored animal. 5.0 pounds, 5.0 inches\n";
		String actual = zoo1.toString();
		Assert.assertEquals(expected, actual);
	}
	
}