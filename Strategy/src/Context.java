public class Context {
    private Strategy contextStrategy;
    public void setContext(Strategy contextStrategy){
        this.contextStrategy = contextStrategy;
    }
    public void used(int usage){contextStrategy.howMuch(usage);
    }
}
