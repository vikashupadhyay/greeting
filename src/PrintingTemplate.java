public class PrintingTemplate {
    private String text;

    public PrintingTemplate(String text) {
        this.text = text;
    }

    public String format() {
        int maxLength = getMaxLength();
        String line = makeLine(maxLength);
        String splittedText[] = text.split("\n");
        String dottedLineWithPlusSign = "+" + line + "+\n";
        String namePresentation = "| " + splittedText[0] + makeSpace(splittedText[0], maxLength) + " |\n|";
        String cityAndState = "|\n| " + splittedText[1] + makeSpace(splittedText[1], maxLength);
        String country = " |\n| " + splittedText[2] + makeSpace(splittedText[2], maxLength) + " |\n+";
        return dottedLineWithPlusSign + namePresentation + line + cityAndState + country + line + "+";
    }

    private int getMaxLength() {
        String splittedText[] = text.split("\n");
        int maxLength = 0;
        for (String each : splittedText) {
            if (each.length() > maxLength)
                maxLength = each.length();
        }
        return maxLength;
    }

    private String makeLine(int lenght) {
        String line = "";
        for (int i = 0; i < lenght + 2; i++) line += "-";
        return line;
    }

    private String makeSpace(String text, int totalLength) {
        String whiteSpace = "";
        int numOfWhiteSpace = totalLength - text.length();
        for (int i = 0; i < numOfWhiteSpace; i++) whiteSpace += " ";
        return whiteSpace;
    }
}
