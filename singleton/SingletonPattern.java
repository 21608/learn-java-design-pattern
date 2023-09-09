final class SingletonPattern {
    private static final SingletonPattern instance = new SingletonPattern();
    private SingletonPattern() {}
    public static SingletonPattern getInstance() {
      return SingletonPattern.instance;
    }
}