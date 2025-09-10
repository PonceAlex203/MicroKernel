package unicauca.edu.co;

import java.util.List;
import unicauca.edu.co.entities.Project;
import unicauca.edu.co.interfaces.IReportPlugin;

public class JsonReportPlugin implements IReportPlugin {
    @Override
    public String generateReport(List<Project> data) {
        StringBuilder sb = new StringBuilder();
        sb.append("[\n");
        for (int i = 0; i < data.size(); i++) {
            Project p = data.get(i);
            sb.append("{\n")
              .append("\"id\": \"").append(p.getId()).append("\",\n")
              .append("\"nombre\": \"").append(p.getNombre()).append("\",\n")
              .append("\"fechaFormatoA\": \"").append(p.getFechaFormatoA()).append("\",\n")
              .append("\"estudiante1\": \"").append(p.getEstudiante1()).append("\",\n")
              .append("\"estudiante2\": ").append(p.getEstudiante2() != null ? "\"" + p.getEstudiante2() + "\"" : "null").append(",\n")
              .append("\"profesor\": \"").append(p.getProfesor()).append("\",\n")
              .append("\"tipo\": \"").append(p.getTipo()).append("\",\n")
              .append("\"programa\": \"").append(p.getPrograma()).append("\"\n")
              .append("}");
            if (i < data.size() - 1) sb.append(",");
            sb.append("\n");
        }
        sb.append("]");
        return sb.toString();
    }
}