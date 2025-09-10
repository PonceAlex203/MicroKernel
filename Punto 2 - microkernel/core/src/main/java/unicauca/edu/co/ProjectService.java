package unicauca.edu.co;

import java.util.ArrayList;
import java.util.List;
import unicauca.edu.co.entities.Project;

public class ProjectService {
    public List<Project> getAll() {
        List<Project> projects = new ArrayList<>();
        projects.add(new Project("101", "Sistema de Detección de Plagas con IA", "15/05/2025", "Ana Pérez", "Luis Gómez", "Dr. Juan Torres", "Investigación", "Sistemas"));
        projects.add(new Project("205", "Automatización de Riego por Sensores", "20/06/2025", "Sofía Rojas", null, "Ing. Carlos Méndez", "Práctica Profesional", "Electrónica"));
        projects.add(new Project("310", "Robot de Limpieza Autónomo", "30/07/2025", "Jorge Arias", "Diana Castro", "Dr. Laura Vélez", "Investigación", "Automática"));
        return projects;
    }
}