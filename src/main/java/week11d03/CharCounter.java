package week11d03;

public class CharCounter {

    public int countChars(String[] chars) {
        char[] searches = shortestStringFinder(chars).toCharArray();
        int counter = 0;
        for (Character search : searches) {
            if (charFoundInAll(search, chars)){
                counter++;
            }
        }
        return counter;
    }


    private String shortestStringFinder(String[] chars) {
        String shortest = chars[0];
        for (String item : chars) {
            if (item.length() < shortest.length()) {
                shortest = item;
            }
        }
        return shortest;
    }

    private boolean charFoundInAll(Character search, String[] chars){
        boolean foundInAll = true;
        for (String item : chars) {
            if (!item.contains(search.toString())){
                foundInAll = false;
            }
        }
        return foundInAll;
    }

}
