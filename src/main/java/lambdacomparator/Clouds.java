package lambdacomparator;

import java.util.*;

public class Clouds {

    public CloudStorage alphabeticallyFirst(List<CloudStorage> cloudStorages){
        return Collections.min(cloudStorages , Comparator.comparing(cloudStorage -> cloudStorage.getProvider().toLowerCase()));
    }

    public CloudStorage bestPriceForShortestPeriod(List<CloudStorage> cloudStorages){
        return Collections.min(cloudStorages, Comparator.comparing(CloudStorage::getPeriod, Comparator.nullsFirst(Comparator.comparingInt(PayPeriod::getLength)))
                .thenComparing(CloudStorage::getPrice));
    }

    public List<CloudStorage> worstOffers(List<CloudStorage> cloudStorages){
        List<CloudStorage> copy = new ArrayList<>(cloudStorages);
        copy.sort(Comparator.reverseOrder());
        return copy.subList(0, Math.min(copy.size(), 3));
    }
}
