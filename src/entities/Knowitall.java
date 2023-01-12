package entities;
import exeption.WrongTypeOfPerson;
import objects.Baloon;
import objects.Bush;

import java.util.function.Consumer;

public class Knowitall extends AbstractEntity implements Orderedable {
    public Knowitall(String name){
        super(name);
    }
    public void tiePipe(Baloon baloon){
        System.out.println(this.getName()+" завязал верёвочкой резиновую трубку, чтобы из "+baloon.getName()+
                " не выходил воздух");
    }
    public void speak(){
        System.out.println(this.getName()+" сказал");
    }

    public void tiedsmth(Baloon baloon,Bush bush){
        System.out.println(this.getName()+" привязал "+baloon.getName()+" верёвкой к "+bush.getName()+", " +
                "чтобы "+baloon.getName()+" не " + "унесло ветром");
    }
    public void dividedPeople(AbstractEntity kids) {
        try {
            if (! (kids instanceof Kids))
                throw new WrongTypeOfPerson();
            else System.out.println(this.getName()+" поделил "+kids.getName()+" на два отряда");
        }
        catch (WrongTypeOfPerson type){
            System.out.println(type.describe());
        }

    }



    @Override
    public void order(AbstractEntity name, Item item){
        switch (item){
            case COCOONS:
                System.out.println(this.getName()+" велел "+name.getName()+" собрать шелковинчные коконы");
                break;
            case NET:
                System.out.println(this.getName()+" велел "+name.getName()+" собрать шелковинчные коконы");
                break;
            case THREAD:
                System.out.println(this.getName()+" велел "+name.getName()+" наделать шекловых нитей");
                break;
            case LARGEBASKET:
                System.out.println(name.getName()+" "+this.getName()+" велел сделать большую корзину");
                break;
        }
    }
    @Override
    public void action(){
        System.out.println(this.getName()+ " занимался работой");
    }
}
