public class EquipmentTest
{

    /**
     * Test the Equipment constructor and the getters
     */
    public void constructorParamsTest() throws AssertException
    {
        // Use the default constructor
        String strg = "batman/5,2.0,3.0,A batshaped bat";
        Equipment batEquip = new Equipment(strg);
        String name = 
        Assert.assertEquals(strg.parse(0,5), batEquip.getName());

    }
}