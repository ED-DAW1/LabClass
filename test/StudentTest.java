
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carlos
 */
public class StudentTest {
    Student s;
        
    @Before
    public void setUp() {
        s = new Student("Nombre1","ABCD");
    } 
    
    @Test
    public void testChangeName() {
        s.changeName("Nuevo Nombre");
        assertEquals("Nuevo Nombre",s.getName());
        assertFalse("Nombre1".equals(s.getName()));
    }
    
    @Test 
    public void testAddCredits() {
        s.addCredits(5);
        s.addCredits(10);
        assertTrue(s.getCredits() == 15);
        assertFalse(s.getCredits() == 10);
    }
    
    @Test
    public void testLoginName() {
        assertEquals("NombABC",s.getLoginName());
        assertFalse("NomAB".equals(s.getLoginName()));
    }      
    
}
