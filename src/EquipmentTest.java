public class EquipmentTest
{

    /**
     * Test the Equipment constructor and the getters
     */
    public void constructorParamsTest() throws AssertException
    {
        // Use the default constructor
        String strg = "batman/5,2.0,3.0,A batshaped bat";
        String[] tokens = strg.split(",");
        String[] idinfo = tokens[0].split("/");
        String name = idinfo[0];
        int count = Integer.parseInt(idinfo[1]);
        double totalWeight = Double.parseDouble(tokens[1]);
        double totalPrice = Double.parseDouble(tokens[2]);
        String description = tokens[3];
        Equipment batEquip = new Equipment(strg);
        
        Assert.assertEquals(name, batEquip.getName());
        Assert.assertEquals(count, batEquip.getCount());
        Assert.assertEquals(totalWeight, batEquip.getTotalWeight());
        Assert.assertEquals(totalPrice, batEquip.getTotalPrice());
        Assert.assertEquals(description, batEquip.getDescription());
    }
    public void toStringTest() throws AssertException
    {
    	Equipment equip1 = new Equipment("batman/5,2.0,3.0,A batshaped bat");
    	String expected = "Name: batman, Number: 5, Weight: 2.00 lbs, Price: $3.00 - A batshaped bat";
    	String actual = equip1.toString();
    	
    	Assert.assertEquals(expected, actual);
    }
    public void getNameTest() throws AssertException
    {
    	Equipment equip1 = new Equipment("batman/5,2.0,3.0,A batshaped bat");
    	String expected = "batman";
    	String actual = equip1.getName();
    	
    	Assert.assertEquals(expected, actual);
    }
    public void getCountTest() throws AssertException
    {
    	Equipment equip1 = new Equipment("batman/5,2.0,3.0,A batshaped bat");
    	int expected = 5;
    	int actual = equip1.getCount();
    	
    	Assert.assertEquals(expected, actual);
    }
    public void getTotalWeightTest() throws AssertException
    {
    	Equipment equip1 = new Equipment("batman/5,2.0,3.0,A batshaped bat");
    	double expected = 2.0;
    	double actual = equip1.getTotalWeight();
    	Assert.assertEquals(expected, actual);
    }
}