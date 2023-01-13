package entities.exeptions;

public class WrongTypeOfPerson extends RuntimeException{
    public WrongTypeOfPerson(String description){
        super(description);
    }
}
