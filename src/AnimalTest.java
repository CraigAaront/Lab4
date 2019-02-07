/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }
	public void testConstructorParams() throws AssertException
	{
		String color1 = "blue";
		String name1 = "john";
		double weight1 = 20.0;
		double height1 = 20.0;
		Animal ani1 = new Animal(color1, name1, weight1, height1);
		
		Assert.assertEquals(color1, ani1.getColor());
		Assert.assertEquals(name1, ani1.getName());
		Assert.assertEquals(weight1, ani1.getWeight());
		Assert.assertEquals(height1, ani1.getHeight());

	}
	public void testToString() throws AssertException
	{
		Animal ani1 = new Animal("blue", "john", 20.0, 20.0);
		String expected = ("john, a blue-colored animal. 20.0 pounds, 20.0 inches\n");
		String actual = ani1.toString();
		Assert.assertEquals(expected, actual);
	}
    // TODO: test full constructor, getters, and toString
}

