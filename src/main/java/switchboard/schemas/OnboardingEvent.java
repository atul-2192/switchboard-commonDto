package switchboard.schemas;

public class OnboardingEvent {
    private String emailID;
    private String fullName;

    public OnboardingEvent() {
    }
    public OnboardingEvent(String emailID, String fullName) {
        this.emailID = emailID;
        this.fullName = fullName;
    }
    public String getEmailID() {
        return emailID;
    }
    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
