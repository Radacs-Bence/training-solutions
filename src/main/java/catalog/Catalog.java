package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem) {
        catalogItems.add(catalogItem);
    }

    public double averagePageNumberOver(int minimum) {
        if (minimum <= 0){
            throw new IllegalArgumentException("Page number must be positive");
        }
        int counter = 0;
        double pages = 0.0;
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.numberOfPagesAtOneItem() > minimum) {
                pages += catalogItem.numberOfPagesAtOneItem();
                counter++;
            }
        }
        if (counter == 0){
            throw new IllegalArgumentException("No page");
        }
        return pages / counter;
    }

    public void deleteItemByRegistrationNumber(String registrationNumber) {
        CatalogItem toBeRemoved = null;
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.getRegistrationNumber().equals(registrationNumber)){
                toBeRemoved = catalogItem;
            }
        }
        catalogItems.remove(toBeRemoved);
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        List<CatalogItem> result = new ArrayList<>(catalogItems);
        List<CatalogItem> itemsNotSearchedFor = new ArrayList<>(catalogItems);
        if (searchCriteria.hasTitle()) {
            itemsNotSearchedFor.removeAll(findItemsByTitle(searchCriteria.getTitle()));
        }
        if (searchCriteria.hasContributor()) {
            itemsNotSearchedFor.removeAll(findItemsByContributor(searchCriteria.getContributor()));
        }
        result.removeAll(itemsNotSearchedFor);
        return result;
    }

    private List<CatalogItem> findItemsByTitle(String title) {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.getTitles().contains(title)) {
                result.add(catalogItem);
            }
        }
        return result;
    }

    private List<CatalogItem> findItemsByContributor(String contributor) {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.getContributors().contains(contributor)) {
                result.add(catalogItem);
            }
        }
        return result;
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasAudioFeature()) {
                result.add(catalogItem);
            }
        }
        return result;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasPrintedFeature()) {
                result.add(catalogItem);
            }
        }
        return result;
    }

    public int getAllPageNumber() {
        int result = 0;
        for (CatalogItem catalogItem : catalogItems) {
            result += catalogItem.numberOfPagesAtOneItem();
        }
        return result;
    }

    public int getFullLength() {
        int result = 0;
        for (CatalogItem catalogItem : catalogItems) {
            result += catalogItem.fullLengthAtOneItem();
        }
        return result;
    }

}
