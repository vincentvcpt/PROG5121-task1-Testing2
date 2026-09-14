/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestingStudentClass;

import com.mycompany.studenttotalmarks.StudentClass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author emeris
 */
public class TestStudentClass 
{
    // eiunf niuenf on 
    @Test
    public void testCalculateFinalAvg()
    {
        StudentClass stClass = new StudentClass(" ST12345 ", "BCAD");
        int expected = 61;
        int actual = stClass.calculateAvg(85, 60, 45);
        assertEquals(expected, actual);
    }
    // kjdsifij jsbdif 
        @Test
        public void testCheckforDistinction()
        {
            StudentClass stClass = new StudentClass(" ST12345 ", "BCAD");
            String results = stClass.checkResult(80);
            assertEquals("Passed with distinction", results);
        }
      
}
