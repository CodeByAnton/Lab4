package entities;

public class Shorties extends AbstractEntity{
    public Shorties(String name){
        super(name);
    }

    @Override
    public void action() {
        System.out.println(this.getName()+" задумались");
    }
    public void ask(Knowitall knowitall){
        System.out.println(this.getName()+" стали спрашивать "+knowitall.getName());
    }
}
