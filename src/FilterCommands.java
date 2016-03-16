import personInfo.Age;
import personInfo.Country;

import java.util.HashMap;

public class FilterCommands {

    private HashMap<Object, Object[]> hashMap = new HashMap<>();
    private String[] arg;


    public FilterCommands(String[] arg) {

        this.arg = arg;
    }

    public void recordAccToOption(RecordFilter recordPrinter) {
            hashMap.put("-fl", recordPrinter.getfirstNameFirst());
            hashMap.put("-lf", recordPrinter.getLastNameFirst());
            hashMap.put("-flb", recordPrinter.getFirstNameFirstWithAddress());
            hashMap.put("-lfb", recordPrinter.getLastNameFirstWithAddress());
        if(arg.length==3) {
            Country country = new Country(arg[1]);
            hashMap.put("-flc", recordPrinter.getfirstNameFirstOfGivenCountry(country));
            hashMap.put("-lfc", recordPrinter.getLastNameFirstOfGivenCountry(country));
        }
        if(arg.length==4){
            Country country = new Country(arg[1]);
            Age age = new Age(Integer.parseInt(arg[2]));
            hashMap.put("-flca", recordPrinter.getFirstNameFirstGivenCountryAndAge(country,age));
            hashMap.put("-lfca", recordPrinter.getLastNameFirstOfGivenCountryAndAge(country,age));
        }
        hashMap.put("-h",printUsage());
        hashMap.put("--help",printUsage());
    }

    public Object[] recordsToPrint() {
        if(hashMap.containsKey(arg[0])) {
            return hashMap.get(arg[0]); // here is encapsulation leak...
        }else
        return null;
    }
    private String[] printUsage(){
        String[] usage = new String[1];
        usage[0] = "usage:-\n" +
                "<-ff> <filePath> - first name first format.\n" +
                "<-lf> <filePath> - last name first format.\n" +
                "<-flb> <filePath> - first name first with border.\n"+
                "<-lfb> <filePath> - last name first with border.\n"+
                "<-ffc> <country> <filePath>  - first name first format along with country.\n" +
                "<-lfc> <country> <filePath>  - last name first format along with country.\n" +
                "<-ffca> <country> <age> <filePath>  - first name first format along with country and age.\n" +
                "<-lfca>  <country> <age> <filePath>  - last name first formal along with country and age.";
        return usage;
    }
}
