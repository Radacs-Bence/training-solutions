package interfacedefaultmethods.print;

public class Printer {

    public String print(Printable printable){
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < printable.getLength(); i++){
            if (printable.BLACK.equals(printable.getColor(i))){
                text.append(printable.getPage(i) + "\n");
            } else {
                text.append(String.format("[%s]%s\n",printable.getColor(i), printable.getPage(i)));
            }
        }
        return text.toString();
    }

}
