package entities;

import objects.Baloon;
import objects.Bush;

public class Residents extends AbstractEntity implements Comeable, Watchable, Tryable {
    public Residents(String name){
        super(name);
    }

    @Override
    public void action() {

    }
    @Override
    public void come(){
        System.out.println(this.getName()+" приходили");
    }

    @Override
    public void watch(Baloon baloon, Bush bush) {
        System.out.println(this.getName()+" смотрели на огромнейший "+baloon.getName()+", который был привязан к "+bush.getName());
    }

    public class Hands{
        public void reach(Baloon baloon){
            System.out.println(Residents.this.getName()+" тянули руки к "+baloon.getName());
        }
    }

    @Override
    public void trying(Baloon baloon) {
        System.out.println("некоторые "+this.getName()+" пытались приподнять "+baloon.getName());
    }
}
