public class Building {
    private Buns buns;
    private Patty patty;
    private Topping topping;

    void setBuns(Buns buns) {
        this.buns = buns;
    }

    void setPatty(Patty patty) {
        this.patty = patty;
    }

    void setTopping(Topping topping) {
        this.topping = topping;
    }

    @Override
    public String toString(){
        return "[Buns:" + this.buns + ", Patty:" + this.patty + ", Topping:" + this.topping + "]";
    }
}