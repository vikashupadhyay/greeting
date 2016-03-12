public class PrintingTemplate {

    private String text;


    public PrintingTemplate(String text) {
        this.text = text;
    }

    public String format() {
        int maxLength = getMaxLength();
        String line = makeLine(maxLength);
        String splittedText[] = text.split("\n");
        String formatToPrint = "+" + line + "+\n" + "| " + splittedText[0] + makeSpace(splittedText[0], maxLength) + " |\n|"
                + line + "|\n| " + splittedText[1] + makeSpace(splittedText[1], maxLength) + " |\n| " + splittedText[2] + makeSpace(splittedText[2], maxLength) + " |\n+" + line + "+";


        return formatToPrint;
    }

    private int getMaxLength() {
        String splittedText[] = text.split("\n");
        int maxLength = 0;
        for (String s : splittedText) {
            if (s.length() > maxLength)
                maxLength = s.length();
        }
        return maxLength;
    }

    private String makeLine(int lenght) {
        String line = "";
        for (int i = 0; i < lenght + 2; i++) {
            line += "-";
        }
        return line;
    }

    private String makeSpace(String text, int totalLength) {
        String whiteSpace = "";
        int numOfWhhiteSpace =totalLength - text.length();
        for (int i = 0; i <numOfWhhiteSpace; i++) {
            whiteSpace += " ";
        }
        return whiteSpace;
    }
}
