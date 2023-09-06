public class BuilderPattern {
    public static void main(String[] args) {
        Director d1 = new Director(new HamburgerBuilder());
        Director d2 = new Director(new RiceburgerBuilder());
        Building b1 = d1.construct();
        Building b2 = d2.construct();
        System.out.println(b1);
        System.out.println(b2);
    }
}