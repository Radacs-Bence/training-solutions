package properties;

import java.io.*;
import java.util.Properties;

public class DatabaseConfiguration {

    private static final String ENCODING = "UTF-8";

    private Properties properties;

    public DatabaseConfiguration() {
        this.properties = new Properties();
        try (InputStreamReader reader = new InputStreamReader(DatabaseConfiguration.class.getResourceAsStream("/db.properties"), "windows-1250")) {
            properties.load(reader);
        } catch (IOException ioException) {
            throw new IllegalArgumentException("Cannot read file");
        }
    }

    public DatabaseConfiguration(File file) {
        this.properties = new Properties();
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(file), ENCODING)) {
            properties.load(reader);
        }  catch (IOException ioException) {
            throw new IllegalArgumentException("Cannot read file");
        }
    }

    public String getHost(){
        return properties.getProperty("db.host");
    }

    public int getPort(){
        return Integer.parseInt(properties.getProperty("db.port"));
    }

    public String getSchema(){
        return properties.getProperty("db.schema");
    }

}
