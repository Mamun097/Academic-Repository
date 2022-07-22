import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeCalculatorTest {
    GradeCalculator gradeCalculator=new GradeCalculator();

    //Test cases for 4 credit:
    //320-400 ->A
    @Test
    void _400point5_In4CreditShouldReturnError(){
        assertThrows(GreaterThan400For4CreditException.class,
                ()-> gradeCalculator.FindGradeFor4Credit(400.5));
    }
    @Test
    void _400_In4CreditShouldReturnA() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor4Credit(400),"A");
    }
    @Test
    void _399point5_In4CreditShouldReturnA() throws Exception{
        assertEquals(gradeCalculator.FindGradeFor4Credit(399.5),"A");
    }
    @Test
    void _350_In4CreditShouldReturnA() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor4Credit(350),"A");
    }
    @Test
    void _320_In4CreditShouldReturnA() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor4Credit(320),"A");
    }
    @Test
    void _319point2_In4CreditShouldReturnA() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor4Credit(319.2),"A");
    }

    //280-319 ->B
    @Test
    void _319_In4CreditShouldReturnB() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor4Credit(319),"B");
    }
    @Test
    void _300_In4CreditShouldReturnB() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor4Credit(300),"B");
    }
    @Test
    void _280_In4CreditShouldReturnB() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor4Credit(280),"B");
    }
    @Test
    void _279point5_In4CreditShouldReturnB() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor4Credit(279.5),"B");
    }

    //240-279 ->C
    @Test
    void _279_In4CreditShouldReturnC() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor4Credit(279),"C");
    }
    @Test
    void _250_In4CreditShouldReturnC() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor4Credit(250),"C");
    }
    @Test
    void _240_In4CreditShouldReturnC() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor4Credit(240),"C");
    }
    @Test
    void _239point1_In4CreditShouldReturnC() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor4Credit(239.1),"C");
    }

    //<240    ->F
    @Test
    void _239_In4CreditShouldReturnF() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor4Credit(239),"F");
    }
    @Test
    void _0_In4CreditShouldReturnF() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor4Credit(0),"F");
    }

    //Negative Input
    @Test
    void _minusPoint5_In4CreditShouldReturnError(){
        assertThrows(LessThanZeroException.class,
                ()->gradeCalculator.FindGradeFor4Credit(-0.5));
    }

    //String & Char input
    @Test
    void _stringXYZ_In4CreditShouldReturnError(){
        assertThrows(StringInputException.class,
                ()->gradeCalculator.FindGradeFor4Credit("XYZ"));
    }
    @Test
    void _charX_In4CreditShouldReturnError(){
        assertThrows(CharacterInputException.class,
                ()->gradeCalculator.FindGradeFor4Credit('X'));
    }

    //Blank input
    @Test
    void _blank_In4CreditShouldReturnError(){
        assertThrows(BlankInputException.class,
                ()->gradeCalculator.FindGradeFor4Credit());
    }


    //Test Cases for 3 Credit
    //240-300 ->A
    @Test
    void _320_In3CreditShouldReturnError(){
        assertThrows(GreaterThan300For3CreditException.class,
                ()->gradeCalculator.FindGradeFor3Credit(320));
    }
    @Test
    void _300point5_In3CreditShouldReturnError(){
        assertThrows(GreaterThan300For3CreditException.class,
                ()->gradeCalculator.FindGradeFor3Credit(300.5));
    }
    @Test
    void _300_In3CreditShouldReturnA() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor3Credit(300),"A");
    }
    @Test
    void _270_In3CreditShouldReturnA() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor3Credit(270),"A");
    }
    @Test
    void _240_In3CreditShouldReturnA() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor3Credit(300),"A");
    }
    @Test
    void _239point5_In3CreditShouldReturnA() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor3Credit(239.5),"A");
    }

    //210-239 ->B
    @Test
    void _239_In3CreditShouldReturnB() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor3Credit(239),"B");
    }
    @Test
    void _220_In3CreditShouldReturnB() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor3Credit(220),"B");
    }
    @Test
    void _210point5_In3CreditShouldReturnB() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor3Credit(210.5),"B");
    }
    @Test
    void _210_In3CreditShouldReturnB() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor3Credit(210),"B");
    }
    @Test
    void _209point5_In3CreditShouldReturnB() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor3Credit(209.5),"B");
    }

    //180-209 ->C
    @Test
    void _209_In3CreditShouldReturnC() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor3Credit(209),"C");
    }
    @Test
    void _200_In3CreditShouldReturnC() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor3Credit(200),"C");
    }
    @Test
    void _180_In3CreditShouldReturnC() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor3Credit(180),"C");
    }
    @Test
    void _179point5_In3CreditShouldReturnC() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor3Credit(179.5),"C");
    }

    //<180  ->F
    @Test
    void _179_In3CreditShouldReturnF() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor3Credit(179),"F");
    }
    @Test
    void _100_In3CreditShouldReturnF() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor3Credit(100),"F");
    }
    @Test
    void _0_In3CreditShouldReturnF() throws Exception {
        assertEquals(gradeCalculator.FindGradeFor3Credit(0),"F");
    }

    //Negative Input
    @Test
    void _minusPoint5_In3CreditShouldReturnError(){
        assertThrows(LessThanZeroException.class,
                ()->gradeCalculator.FindGradeFor3Credit(-0.5));
    }

    //String & Char input
    @Test
    void _stringXYZ_In3CreditShouldReturnError(){
        assertThrows(StringInputException.class,
                ()->gradeCalculator.FindGradeFor3Credit("XYZ"));
    }
    @Test
    void _charX_In3CreditShouldReturnError(){
        assertThrows(CharacterInputException.class,
                ()->gradeCalculator.FindGradeFor3Credit('X'));
    }

    //Blank input test
    @Test
    void _blank_In3CreditShouldReturnError(){
        assertThrows(BlankInputException.class,
                ()->gradeCalculator.FindGradeFor3Credit());
    }

    //Testing the exceptions
    @Test
    void LessThanZeroExceptionTest(){
        assertEquals(new LessThanZeroException().to_string(), "Input less than zero");
    }
    @Test
    void GreaterThan300For3CreditExceptionTest(){
        assertEquals(new GreaterThan300For3CreditException().to_string(), "Greater than 300");
    }
    @Test
    void GreaterThan400For4CreditExceptionTest(){
        assertEquals(new GreaterThan400For4CreditException().to_string(), "Greater than 400");
    }
    @Test
    void StringInputExceptionTest(){
        assertEquals(new StringInputException().to_string(), "String Input");
    }
    @Test
    void CharacterInputExceptionTest(){
        assertEquals(new CharacterInputException().to_string(), "Character input");
    }
    @Test
    void BlankInputExceptionTest(){
        assertEquals(new BlankInputException().to_string(), "blank input");
    }
}