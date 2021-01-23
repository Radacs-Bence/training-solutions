package collectionsmap;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogParser {

    public static final String LINE_BREAK = "\n";
    public static final String SEPARATOR = ":";
    public static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");


    public Map<String, List<Entry>> parseLog(String log) {
        Map<String, List<Entry>> logMap = new HashMap<>();
        String[] lines = log.split(LINE_BREAK);
        for (String line : lines) {
            String[] parts = line.split(SEPARATOR);
            LocalDate entryDate = checkAndParse(parts);
            String ipAddress = parts[0];
            String login = parts[2];
            if (!logMap.containsKey(ipAddress)){
                logMap.put(ipAddress, new ArrayList<Entry>());
            }
            logMap.get(ipAddress).add(new Entry(ipAddress, login, entryDate));
        }

        return logMap;
    }

    private LocalDate checkAndParse(String[] parts){
        LocalDate entryDate = null;
        if (parts.length != 3) {
            throw new IllegalArgumentException("Incorrect log: incorrect number of fields");
        }
        try {
            entryDate = LocalDate.parse(parts[1], DATE_FORMAT);
        }catch (DateTimeParseException pe) {
            throw new IllegalArgumentException("Incorrect log: incorrect date");
        }
        return entryDate;
    }


}