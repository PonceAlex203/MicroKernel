package unicauca.edu.co.interfaces;

import java.util.List;
import unicauca.edu.co.entities.Project;

public interface IReportPlugin {
    String generateReport(List<Project> data);
}
