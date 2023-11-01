import java.util.Arrays;

public class LoweringGradeFilter implements Filter<String>{
    @Override
    public String execute(String input) {
        String [] fields = input.split(",");
        String[] noGrade = Arrays.copyOfRange(fields, 0, fields.length-1);
        String res = "";
        for (String field : noGrade){
            res += field + ",";
        }
        String grade = fields[fields.length-1].toLowerCase();
        if (grade.length()<3) {
            int newGrade = Integer.parseInt(grade) - 5;
            res += newGrade;
        }

        System.out.println(res);
        return res;
    }
}
