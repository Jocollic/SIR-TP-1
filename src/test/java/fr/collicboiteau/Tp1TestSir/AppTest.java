package fr.collicboiteau.Tp1TestSir;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
 public class AppTest 
{
   

    /**
     * Rigourous Test :-)
     */
    @Test

    public void testApp()
    {
        assertTrue( true );
    }
    @Test

    public void testApp2()
    {
        assertFalse( false );
        assertEquals(0, 0);
    }
    @Test

    public void testAppVeritable()
    {
         App a= new App() ;
        assertEquals(1, a.rien());
    }
}
