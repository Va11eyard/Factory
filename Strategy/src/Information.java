public class Information implements Strategy {
    private String Login;
    private String Password;

    public Information(String Login, String Password){
        this.Login = Login;
        this.Password = Password;
    }
    @Override
    public void howMuch(int usage){
        System.out.println("This login:" + " " + Login + " " +  "used" + " " + usage + " " + "times");
    }
}
