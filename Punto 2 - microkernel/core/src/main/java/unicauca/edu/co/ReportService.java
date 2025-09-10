package unicauca.edu.co;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import unicauca.edu.co.entities.Project;
import unicauca.edu.co.interfaces.IReportPlugin;

public class ReportService {
    private final ProjectService projectService = new ProjectService();

    public String generateReport(String format) throws IllegalArgumentException, InvocationTargetException {
        List<Project> projects = projectService.getAll();
        IReportPlugin plugin = ReportPluginManager.getInstance().getReportPlugin(format);
        if (plugin == null) {
            return "No existe plugin para el formato: " + format;
        }
        return plugin.generateReport(projects);
    }
}