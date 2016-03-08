import java.util.Arrays;

public class FilterFileAndOption {
    private final String[] args;

    public FilterFileAndOption(String[] args) {
        this.args = args;
    }

    @Override
    public String toString() {
        return "FilterFileAndOption{" +
                "args=" + Arrays.toString(args) +
                '}';
    }

    public String[] getArgs() {
        System.out.println(args[0]);
        return args;
    }

    public String getOption() {
        return args[1];
    }
}
