package defaultconstructor;

public class SimpleDateFormatter {

    private CountryCode defaultCountryCode;

    public SimpleDateFormatter() {
        this.defaultCountryCode = CountryCode.HU;
    }

    public String formatDateString(SimpleDate simpleDate){
        return formatDateStringByCountryCode(defaultCountryCode, simpleDate);

    }

    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate){
        String textFormat = "%d-%d-%d";
        String text = "";
        if (countryCode == CountryCode.HU){
            text = String.format(textFormat, simpleDate.getYear(), simpleDate.getMonth(), simpleDate.getDay());
        }
        if (countryCode == CountryCode.EN){
            text = String.format(textFormat, simpleDate.getDay(), simpleDate.getMonth(), simpleDate.getYear());
        }
        if (countryCode == CountryCode.US){
            text = String.format(textFormat, simpleDate.getMonth(), simpleDate.getDay(), simpleDate.getYear());
        }
        return text;
    }

}
