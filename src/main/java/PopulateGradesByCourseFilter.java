import java.util.HashMap;
import java.util.Map;

public class PopulateGradesByCourseFilter implements Filter<String>{
    Map<String, Integer> gradesByCourseGroup = new HashMap<String, Integer>();
    Map<String, Double> numberPassing = new HashMap<String, Double>();
    @Override
    public String execute(String input) {

        String[] fields = input.split(",");

        if (fields[2].length() < 3 && Integer.parseInt(fields[2]) > 5) {
            if (gradesByCourseGroup.containsKey(fields[1])) {
                gradesByCourseGroup.put(fields[1], gradesByCourseGroup.get(fields[1]) + Integer.valueOf(fields[2]));
            } else {
                gradesByCourseGroup.put(fields[1], Integer.valueOf(fields[2]));
            }

            if (numberPassing.containsKey(fields[1])) {
                numberPassing.put(fields[1], numberPassing.get(fields[1]) + 1);
            } else {
                numberPassing.put(fields[1], 1.0);
            }
            System.out.println(input);


        }
        return input;
    }
}
