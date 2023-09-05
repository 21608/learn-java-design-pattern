public class RiceburgerBuilder implements Builder {
    private Building building;
    RiceburgerBuilder() {
        this.building = new Building();
    }

    @Override
    public void buildBuns() {
        this.building.setBuns(Buns.RICE);
    }

    @Override
    public void buildPatty() {
        this.building.setPatty(Patty.CHICKEN);
    }

    @Override
    public void buildTopping() {
        this.building.setTopping(Topping.TOMATO);
    }

    @Override
    public Building getResult() {
        return this.building;
    }
}