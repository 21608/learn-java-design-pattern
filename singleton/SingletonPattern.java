final class SingletonPattern {
    private SingletonPattern() {}
    private static class SingletonPatternHolder {
        private static final SingletonPattern instance = new SingletonPattern();
    }
    public static SingletonPattern getInstance() {
         return SingletonPatternHolder.instance;
    }
}