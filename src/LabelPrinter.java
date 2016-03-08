import java.io.File;
import java.io.IOException;
import java.util.List;

public class LabelPrinter {
    public static void main(String[] args) throws IOException {
        File file = new File(args[args.length - 1]);
        String option = args[0];
        FilterFileAndOption filter = new FilterFileAndOption(args);
        int size = (int) file.length();
        FileScanner fileScanner = new FileScanner(file, size);
        String data = fileScanner.readFile();
        AddingDataToPerson addingDataToPerson = new AddingDataToPerson(data);
        addingDataToPerson.addData();
        List<Person> persons = addingDataToPerson.getPersons();
        GetData getData = new GetData(persons);
//        if (option.equals("-fl")) {
//            RecordPrinter printer = new RecordPrinter(getData.getPersonsInFlPattern());
//            printer.print();
//        }
//        else if (option.equals("-lf")) {
//            RecordPrinter printer = new RecordPrinter(getData.getPersonsInLfPattern());
//            printer.print();
//        }
//
//        else if(option.equals("-flc")){
//            String country = args[1];
//            RecordPrinter printer = new RecordPrinter(getData.getPersonsInFlPatternOfGivenCountry(country));
//            printer.print();
//        }
//        else if(option.equals("-lfc")){
//            String country = args[1];
//            System.out.println(getData.getPersonsInLfPatternOfGivenCountry(country));
//        }
//        else if(option.equals("-flca")){
//            String country = args[1];
//            String age = args[2];
//            System.out.println(getData.getPersonsInFlPatternOfGivenCountryAndAge(country,age));
//        }
//        else if(option.equals("-lfca")){
//            String country = args[1];
//            String age = args[2];
//            System.out.println(getData.getPersonsInLfPatternOfGivenCountryAndAge(country,age));
//        }
//        else
//            System.out.println("Invalid");
//
    }
}
