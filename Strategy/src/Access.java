public class Access implements Strategy{
    private String email;

    public Access(String email){
        this.email = email;
    }
    @Override
    public void howMuch(int usage){
        System.out.println("This email:" + " " + email + " " + "used" + " " + usage + " " + "times");
    }
}
