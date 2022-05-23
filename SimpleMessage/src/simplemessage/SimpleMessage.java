package simplemessage;


public class SimpleMessage {

    private Login login;
    private String greeting;
    
    SimpleMessage(String greeting){
        this.greeting = greeting;
    }
    
    public static void main(String[] args) {
        SimpleMessage simple = new SimpleMessage("Hey, Ready to read or send a message ?");
        simple.startApp();
    }
    
    public void startApp(){
        this.login = new Login(this.greeting);
        this.login.setVisible(true);
    }
}
