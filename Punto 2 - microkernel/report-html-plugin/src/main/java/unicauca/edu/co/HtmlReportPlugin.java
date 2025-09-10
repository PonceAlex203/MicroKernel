package unicauca.edu.co;

import java.util.List;
import unicauca.edu.co.entities.Project;
import unicauca.edu.co.interfaces.IReportPlugin;

public class HtmlReportPlugin implements IReportPlugin {

    @Override
    public String generateReport(List<Project> data) {
        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>\n<html lang=\"es\">\n<head>\n<title>Reporte de Proyectos de Grado</title>\n</head>\n<body>\n");
        sb.append("<h1>Reporte de Proyectos de Grado</h1>\n<table>\n<thead>\n<tr>\n");
        sb.append("<th>ID</th><th>Nombre del Proyecto</th><th>Fecha aprobación formato A</th><th>Estudiante(s)</th><th>Profesor</th><th>Tipo</th><th>Programa</th>\n");
        sb.append("</tr>\n</thead>\n<tbody>\n");

        for (Project p : data) {
            sb.append("<tr>\n");
            sb.append("<td>").append(p.getId()).append("</td>");
            sb.append("<td>").append(p.getNombre()).append("</td>");
            sb.append("<td>").append(p.getFechaFormatoA()).append("</td>");
            sb.append("<td>").append(p.getEstudiante1());
            if (p.getEstudiante2() != null) {
                sb.append(", ").append(p.getEstudiante2());
            }
            sb.append("</td>");
            sb.append("<td>").append(p.getProfesor()).append("</td>");
            sb.append("<td>").append(p.getTipo()).append("</td>");
            sb.append("<td>").append(p.getPrograma()).append("</td>");
            sb.append("</tr>\n");
        }

        sb.append("</tbody>\n</table>\n</body>\n</html>");
        return sb.toString();
    }

}
