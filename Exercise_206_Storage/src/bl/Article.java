package bl;

public class Article {

    private int id;
    private String description;
    private int amount;
    private int place;
    private int maxAmount = 75;

    public Article(int id, String description, int amount, int place) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.place = place;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getAmount() throws Exception {
        if (amount > maxAmount) {
            throw new Exception("The max amount is 75!");
        } else if (amount < 0) {
            throw new Exception("The amount can't be smaller than 0!");
        } else {
            return amount;
        }
    }

    public int getPlace() {
        return place;
    }
}
