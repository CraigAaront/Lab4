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
		
	}
}