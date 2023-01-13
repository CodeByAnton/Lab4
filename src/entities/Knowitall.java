package entities;
import entities.exeptions.ItemException;
import entities.exeptions.WrongTypeOfPerson;
import objects.Baloon;
import objects.Bush;


public class Knowitall extends AbstractEntity  {
    public Knowitall(String name){
        super(name);
    }
    private int[] countItems={0,0,0,0};
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
        if (kids instanceof Kids){
            System.out.println(this.getName()+" поделил "+kids.getName()+" на два отряда");
        }
        else throw new WrongTypeOfPerson("You can't divide that type of person");

    }




    public void order(AbstractEntity name, Item item) throws ItemException{
        switch (item){

            case COCOONS:
                countItems[0]+=1;
                if (countItems[0]>1)
                    throw new ItemException("cocoons are already gathering");
                else
                    countItems[0]+=1;
                    System.out.println(this.getName()+" велел "+name.getName()+" собрать шелковинчные коконы");
                break;
            case NET:
                countItems[1]+=1;
                if (countItems[1]>1)
                    throw new ItemException("net is already weaving");
                else
                    System.out.println(this.getName()+" велел "+name.getName()+" сплести огромную сетку");
                break;
            case THREAD:
                countItems[2]+=1;
                if (countItems[2]>1)
                    throw new ItemException("threads are already being made");
                else
                    System.out.println(this.getName()+" велел "+name.getName()+" наделать шекловых нитей");
                break;
            case LARGEBASKET:
                countItems[3]+=1;
                if (countItems[3]>1)
                    throw new ItemException("large basket is already being made");
                else
                    System.out.println(name.getName()+" "+this.getName()+" велел сделать большую корзину");
                break;
        }
    }
    @Override
    public void action(){
        System.out.println(this.getName()+ " занимался работой");
    }
}
