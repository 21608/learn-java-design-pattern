public class Director {
    private Builder builder;

    Director(Builder builder) {
        this.builder = builder;
    }

    Building construct() {
        this.builder.buildBuns();
        this.builder.buildPatty();
        this.builder.buildTopping();
        return this.builder.getResult();
    }
}