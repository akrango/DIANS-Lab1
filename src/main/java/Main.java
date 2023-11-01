import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        ClassLoader loader = PipeAndFilterProblem.class.getClassLoader();
        Scanner scanner = new Scanner(new File(loader.getResource("student_grades.csv").getFile()));
        RemoveNamesFilter filter1=new RemoveNamesFilter();
        GroupCoursesByFieldFilter filter2=new GroupCoursesByFieldFilter();
        LoweringGradeFilter filter3=new LoweringGradeFilter();
        PopulateGradesByCourseFilter filter4=new PopulateGradesByCourseFilter();

        Pipe pipe = new Pipe();
        pipe.addFilter(new RemoveNamesFilter());
        pipe.addFilter(new GroupCoursesByFieldFilter());
        pipe.addFilter(new LoweringGradeFilter());
        pipe.addFilter(filter4);

        while (scanner.hasNextLine()) {
            pipe.runFilters(scanner.nextLine());
            String line = scanner.nextLine();
            String line1 = line.toLowerCase();
            String[] fields = line1.split(",");

        }
    }
}
