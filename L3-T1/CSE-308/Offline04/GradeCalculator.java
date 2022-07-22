public class GradeCalculator {
    public String FindGradeFor3Credit(double mark) throws Exception {
        if(mark>=0){
            mark= Math.ceil(mark);
            if(mark>300) throw new GreaterThan300For3CreditException();
            else if(mark>=240) return "A";
            else if(mark>=210) return "B";
            else if(mark>=180) return "C";
            else return "F";
        }
        else throw new LessThanZeroException();
    }

    //Overlapped functions for string, character & blank input
    public String FindGradeFor3Credit(String mark) throws StringInputException {
        throw new StringInputException();
    }
    public String FindGradeFor3Credit(char mark) throws CharacterInputException {
        throw new CharacterInputException();
    }
    public String FindGradeFor3Credit() throws BlankInputException {
        throw new BlankInputException();
    }

    public String FindGradeFor4Credit(double mark) throws Exception {
        if(mark>=0){
            mark= Math.ceil(mark);
            if(mark>400) throw new GreaterThan400For4CreditException();
            else if(mark>=320) return "A";
            else if(mark>=280) return "B";
            else if(mark>=240) return "C";
            else return "F";
        }
        else throw new LessThanZeroException();
    }

    //Overlapped functions for string, character & blank input
    public String FindGradeFor4Credit(String mark) throws StringInputException {
        throw new StringInputException();
    }
    public String FindGradeFor4Credit(char mark) throws CharacterInputException {
        throw new CharacterInputException();
    }
    public String FindGradeFor4Credit() throws BlankInputException {
        throw new BlankInputException();
    }
}

//Exceptions
class GreaterThan300For3CreditException extends Exception{
    public String to_string(){
        return "Greater than 300";
    }
}
class GreaterThan400For4CreditException extends Exception{
    public String to_string(){
        return "Greater than 400";
    }
}
class StringInputException extends Exception{
    public String to_string(){
        return "String Input";
    }
}
class CharacterInputException extends Exception{
    public String to_string(){
        return "Character input";
    }
}
class LessThanZeroException extends Exception{
    public String to_string(){
        return "Input less than zero";
    }
}
class BlankInputException extends Exception{
    public String to_string(){
        return "blank input";
    }
}


