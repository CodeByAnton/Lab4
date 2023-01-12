package entities;

public enum Item {

    THREAD("Шелковые нити"),
    NET("Огромную сетку"),
    LARGEBASKET("Большую корзину"),
    COCOONS("Шелковинчые коконы");
    private String description;
    Item(String description){
        this.description=description;
    }


}
