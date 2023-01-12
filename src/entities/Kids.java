package entities;

import objects.Baloon;
import objects.Bush;

public class Kids extends AbstractEntity{
    public Kids(String name){
        super(name);
    }

    @Override
    public void action() {

    }
    public void climb(Bush bush){
        System.out.println(this.getName()+" взбирались на "+bush.getName());
    }
    public void smear(Baloon baloon){
        System.out.println(this.getName()+" обмазывали "+baloon.getName()+" сверху и по бокам");
    }
}
