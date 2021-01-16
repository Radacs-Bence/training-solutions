package catalog;

import java.util.List;

public class Validators {

    public static boolean isBlank(String checked){
        return checked == null || checked.isBlank();
    }
    public static boolean isEmpty(List list){
        return list == null || list.isEmpty();
    }
}
