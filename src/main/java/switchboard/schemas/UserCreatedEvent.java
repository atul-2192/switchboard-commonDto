package switchboard.schemas;

import java.io.Serializable;

public class UserCreatedEvent implements Serializable {

    private String name;
    private String emailId;

    public UserCreatedEvent() {
        // Default constructor for deserialization
    }

    public UserCreatedEvent(String name, String emailId) {
        this.name = name;
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "UserCreatedEvent{" +
                "name='" + name + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
