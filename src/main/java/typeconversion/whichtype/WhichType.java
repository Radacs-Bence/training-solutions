package typeconversion.whichtype;

import java.util.ArrayList;
import java.util.List;

public class WhichType {

    public List<Type> whichType(String s){
        List<Type> whichType = new ArrayList<>();
        Long number = Long.parseLong(s);
        for (Type type: Type.values()) {
            if (type.getMinimum() <= number && type.getMaximum() >= number){
                whichType.add(type);
            }
        }
        return whichType;
    }

}
