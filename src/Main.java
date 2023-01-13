import entities.*;
import entities.exeptions.ItemException;
import entities.exeptions.WrongTypeOfPerson;
import objects.Baloon;
import objects.Bush;
public class Main {
    public static void main(String[] args) throws WrongTypeOfPerson {
        Knowitall knowitall=new Knowitall("знайка");
        FirstSquad firstsquad=new FirstSquad("первому отряду");
        SecondSquad secondsquad=new SecondSquad("второму отряду");
        Residents residents=new Residents("жители Цветочного города");
        Residents.Hands hands=residents.new Hands();
        Kids kids=new Kids("малыши");
        Bush bush=new Bush("ореховый куст");
        Baloon baloon=new Baloon("шар");
        Shorties shorties=new Shorties("коротышки");
        Baloon.ChangeSize changeSize=new Baloon.ChangeSize("шара");
        baloon.saveBaloon();
        changeSize.sizeIncrease();
        baloon.fastIncreas();
        kids.climb(bush);
        kids.smear(baloon);
        //anonymous class
        WorkDescribable workDescribable=new WorkDescribable() {
            @Override
            public void startWork() {
                //local class
                class TypeOfWork{
                    public String workType(){
                        return (" по надуванию "+baloon.getName());
                    }
                }
                System.out.println("работа"+(new TypeOfWork()).workType()+" продолжалась два дня");
            }
            @Override
            public void finishWork() {
                System.out.println("работа завершилась");
            }
        };
        workDescribable.startWork();
        workDescribable.finishWork();
        knowitall.tiePipe(baloon);
        knowitall.speak();
        knowitall.tiedsmth(baloon,bush);
        //unchecked exception(if !kids=>unchecked exception)
        knowitall.dividedPeople(kids);
        //checked exception(if try to use one item more than once=>checked exception)
        try {
            knowitall.order(firstsquad, Item.COCOONS);
            knowitall.order(firstsquad, Item.THREAD);
            knowitall.order(firstsquad, Item.NET);
            knowitall.order(secondsquad, Item.LARGEBASKET);

        }
        catch (ItemException e){
            System.out.println(e.getMessage());
        }
        knowitall.action();
        firstsquad.action();
        secondsquad.action();
        residents.come();
        residents.watch(baloon,bush);
        hands.reach(baloon);
        residents.trying(baloon);
        shorties.action();
        shorties.ask(knowitall);
        knowitall.speak();
    }
}
