package enumabstract;

public interface Deletable {

    default boolean canDelete(){
        return false;
    }

}
