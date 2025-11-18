package switchboard.schemas;

public class OTPNotificationEvent {
    private String emailID;
    private String otp;

    public OTPNotificationEvent() {
    }

    public OTPNotificationEvent(String emailID, String otp) {
        this.emailID = emailID;
        this.otp = otp;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }
}
