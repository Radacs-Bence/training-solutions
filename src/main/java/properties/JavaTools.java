package properties;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

public class JavaTools {

    public static final String CHARSET_NAME = "windows-1250";
    private Properties tools = new Properties();

    public JavaTools() {
        try (InputStreamReader reader = new InputStreamReader(JavaTools.class.getResourceAsStream("/javatools.properties"), CHARSET_NAME)) {
            tools.load(reader);
        } catch (IOException ioException) {
            throw new IllegalArgumentException("Cannot read file");
        }
    }

    public Set<String> getToolKeys() {
        Set<String> toolKeys = new HashSet<>();
        for (String propertyName : tools.stringPropertyNames()) {
            toolKeys.add(propertyName.substring(0, propertyName.indexOf(".")));
        }
        return toolKeys;
    }

    public Set<String> getTools() {
        Set<String> toolSet = new HashSet<>();
        for (String key : getToolKeys()){
            toolSet.add(getName(key));
        }
        return toolSet;
    }

    public String getName(String key) {
        return tools.getProperty(key + ".name");
    }

    public String getUrl(String key) {
        return tools.getProperty(key + ".url");
    }

}
