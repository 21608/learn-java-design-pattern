public class HamburgerBuilder implements Builder {
    private Building building;
    HamburgerBuilder() {
        this.building = new Building();
    }

    @Override
    public void buildBuns() {
        this.building.setBuns(Buns.FLOUR);
    }

    @Override
    public void buildPatty() {
        this.building.setPatty(Patty.MEAT);
    }

    @Override
    public void buildTopping() {
        this.building.setTopping(Topping.PICKLES);
    }

    @Override
    public Building getResult() {
        return this.building;
    }
}
