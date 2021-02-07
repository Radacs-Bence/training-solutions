package week14d03;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class UserFilters {

    public UserFilter createFilter(List<Predicate<User>> predicates) {
        return users -> {
            Iterator<User> userIterator = users.iterator();
            while (userIterator.hasNext()) {
                User user = userIterator.next();
                boolean remove = false;
                for (Predicate predicate : predicates) {
                    if (!predicate.test(user)) {
                        remove = true;
                    }
                }
                if (remove) {
                    userIterator.remove();
                }
            }
            return users;
        };
    }


}
