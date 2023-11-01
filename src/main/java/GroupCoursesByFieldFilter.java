import java.util.HashMap;
import java.util.Map;

public class GroupCoursesByFieldFilter implements Filter<String>{
    @Override
    public String execute(String input) {
        Map<String, String> courseGroups = new HashMap<String, String>();
        courseGroups.put("calculus", "math");
        courseGroups.put("discrete mathematics", "math");
        courseGroups.put("probability and statistics", "math");
        courseGroups.put("software architecture and design", "software engineering");
        courseGroups.put("software requirements analysis", "software engineering");
        courseGroups.put("structural programming", "programming");
        courseGroups.put("object oriented programming", "programming");
        courseGroups.put("algorithms and data structures", "programming");

        String res = "";
        String[] fields = input.split(",");
        for (String field : fields){
            if (courseGroups.containsKey(field)){
                res += courseGroups.get(field) + ",";
            }
            else{
                res += field + ",";
            }
        }
        input = res.substring(0,res.length()-1);
        return input;
    }
}
