package unicauca.edu.co;


public class Application {
    public static void main(String[] args) throws Exception {
        // Inicializar plugin manager (se asume que plugin.properties está en ./config/)
        ReportPluginManager.init("config/");

        ReportService service = new ReportService();

        System.out.println("Reporte en formato HTML:");
        System.out.println(service.generateReport("html"));

        System.out.println("\nReporte en formato JSON:");
        System.out.println(service.generateReport("json"));
    }
}