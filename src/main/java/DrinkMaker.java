public class DrinkMaker {

    private Drink drink;

    public DrinkMaker(String drink){
        this.drink = getDrink(drink);
    }

    private Drink getDrink(String drink) {
        switch(drink){
            case "kopi": return new KopiDrink();
            case "teh": return new TehDrink();
            case "milo": return new MiloDrink();
        }
        throw new IllegalArgumentException();
    }

    public DrinkMaker withC() {
        drink = new CDrinkDecorator(drink);
        return this;
    }
    public DrinkMaker withKosong() {
        drink = new KosongDecorator(drink);
        return this;
    }
    public Drink make() {
        return drink;
    }
}