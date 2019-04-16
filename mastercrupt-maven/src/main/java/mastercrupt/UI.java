package mastercrupt;

public class UI {
    private Application application = new Application();
    private String leeted;
    
    public String leetMessage(String unLeeted) {
        application.leet(unLeeted, this);
        return "Leeted: " + leeted;
    }

    public void setLeeted(String leeted) {
        this.leeted = leeted;
    }
}