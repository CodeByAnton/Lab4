package objects;

public class Baloon extends AbstractObject {

    public Baloon(String name) {
        super(name);
    }
    public static class ChangeSize{
        private String object;
        public ChangeSize(String object){
            this.object=object;
        }
        public void sizeIncrease(){
            System.out.println("размеры "+object+" увеличивались");
        }
    }
    public void saveBaloon(){
        System.out.println("но "+this.getName()+" не лопался");
    }
    public void fastIncreas(){
        System.out.println("скоро "+this.getName()+" раздулся большой");

    }

}
