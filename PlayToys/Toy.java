class Toy {
    private int id;
    private String name;
    private int quantity;
    private int probability;

    public Toy (int id, String name, int quantity, int probability){
        this.id=id;
        this.name=name;
        this.quantity=quantity;
        this.probability=probability;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getProbability() {
        return probability;
    }

    public void setProbability(int probability) {
        this.probability = probability;
    }
}
