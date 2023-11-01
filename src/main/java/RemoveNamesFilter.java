import java.util.Arrays;

public class RemoveNamesFilter implements Filter<String>{
    @Override
    public String execute(String input) {
        String line1 = input.toLowerCase();
        String[] fields = line1.split(",");
        String[] noNames = Arrays.copyOfRange(fields, 2, fields.length);
        String res = "";
        for (String field : noNames){
            res += field + ",";
        }

        line1 = res.substring(0,res.length()-1);
        return line1;
    }
}
