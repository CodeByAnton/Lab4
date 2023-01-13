package entities.exeptions;

public class ItemException extends Exception{
    private final static String EXEPTION_DESCRIBE="Mistake, ";
    public ItemException(String description){
        super(EXEPTION_DESCRIBE+description);
    }
}
