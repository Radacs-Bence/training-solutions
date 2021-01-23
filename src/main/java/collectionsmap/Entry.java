package collectionsmap;

import java.time.LocalDate;

public class Entry {

    private final String ipAddress;
    private final String login;
    private final LocalDate entryDate;

    public Entry(String ipAddress, String login, LocalDate entryDate) {
        this.ipAddress = ipAddress;
        this.login = login;
        this.entryDate = entryDate;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getLogin() {
        return login;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

}
