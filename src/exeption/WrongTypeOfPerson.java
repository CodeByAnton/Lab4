package exeption;

public class WrongTypeOfPerson extends Exception{
    public String describe(){
        return "Делить можно только малышей";
    }
}
