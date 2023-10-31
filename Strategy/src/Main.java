public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        context.setContext(new Information("Microsoft@gmail.com", "123123"));
        context.used(24);

        context.setContext(new Access("Apple@gmail.com"));
        context.used(23);
    }
}
