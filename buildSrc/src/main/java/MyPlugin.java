import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * @author pengcheng.qin
 * @date 12/8/19
 */
public class MyPlugin implements Plugin<Project> {
    public static void main(String[] args) {

    }

    @Override
    public void apply(Project target) {
        System.out.println("执行插件");
    }
}
