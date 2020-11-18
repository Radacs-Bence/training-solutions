package stringmethods.url;

public class UrlManager {

    private static String SEPARATOR_PR_H = "://";
    private static String SEPARATOR_H_PO = ":";
    private static String SEPARATOR_PO_PA = "/";
    private static String SEPARATOR_PA_Q = "?";

    private String protocol;
    private Integer port;
    private String host;
    private String path;
    private String query;

    public UrlManager(String url) {

        int endProtocol = url.indexOf(SEPARATOR_PR_H);
        int endHost = -1;
        int endPort = -1;
        Integer port = null;
        String path = null;
        String query = null;
        int endPath = url.indexOf(SEPARATOR_PA_Q);

        if (url.indexOf(":", endProtocol + 3) > -1){
             endHost = url.indexOf(SEPARATOR_H_PO, endProtocol + 3);
             endPort = url.indexOf(SEPARATOR_PO_PA, endHost);
            if (endPort == -1){
                port = Integer.parseInt(url.substring(endHost + 1));
            } else{
                port = Integer.parseInt(url.substring(endHost + 1, endPort));
            }
            if (endPath != -1){
                path = url.substring(endPort, endPath);
                query = url.substring(endPath);
            }
        } else{
            endHost = url.indexOf(SEPARATOR_PO_PA, endProtocol + 3);
            if (endPath != -1){
                path = url.substring(endHost, endPath);
                query = url.substring(endPath);
            }
        }

        if (endProtocol == -1 || endHost == -1){
            throw new IllegalArgumentException("Invalid url");
        }

        String protocol = url.substring(0, endProtocol).toLowerCase();
        String host = url.substring(endProtocol + 3, endHost).toLowerCase();


        if (isEmpty(protocol) || isEmpty(host)){
            throw new IllegalArgumentException("Invalid url");
        }
        if (isEmpty(path) || isEmpty(query)){
            path = "";
            query = "";
        }

        this.protocol = protocol;
        this.port = port;
        this.host = host;
        this.path = path;
        this.query = query;
    }

    public String getProtocol() {
        return protocol;
    }

    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public boolean hasProperty(String key){
        if (isEmpty(key)){
            throw new IllegalArgumentException("Invalid key");
        }

        key += "=";
        return query.contains("?" + key) || query.contains("&" + key);
    }

    public String getProperty(String key){
        if (isEmpty(key)){
            throw new IllegalArgumentException("Invalid key");
        }
        String property = null;
        String[] properties = query.split("&");
        if (hasProperty(key)){
            for (String element: properties) {
                if (element.contains(key)){
                    int separator = element.indexOf("=");
                    property = element.substring(separator+1);
                }
            }
        }

        return property;
    }

    private boolean isEmpty(String string) {
        return string == null || string.isBlank();
    }


}
