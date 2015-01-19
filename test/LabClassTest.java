
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carlos
 */
public class LabClassTest {
    LabClass lab;
        
    @Before
    public void setUp() {
        lab = new LabClass(10);
    }   

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddStudentShouldThrowIndexOutOfBoundsException() {
        LabClass l5 = new LabClass(3);
        l5.enrollStudent(new Student("Nombre1","id1"));
        l5.enrollStudent(new Student("Nombre2","id2"));
        l5.enrollStudent(new Student("Nombre3","id3"));
        l5.enrollStudent(new Student("Nombre4","id4"));        
    }
   
           
    @Test
    public void testAddStudent() {
        Student s1 = new Student("Estudiante1","ABCD");
        Student s2 = new Student("Estudiante2","EFGH");
        lab.enrollStudent(s1);        
        lab.enrollStudent(s2);
        assertTrue(lab.numberOfStudents()==2);        
    }
    
    
    
}
