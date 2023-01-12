package entities;
public class FirstSquad extends AbstractEntity {
    public FirstSquad(String name){
        super(name);
    }
    @Override
    public void action(){
        System.out.println(this.getName()+" выполнял работу");
    }
}

