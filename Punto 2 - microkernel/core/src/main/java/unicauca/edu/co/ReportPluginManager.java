package unicauca.edu.co;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import unicauca.edu.co.interfaces.IReportPlugin;


public class ReportPluginManager {
    private static final String FILE_NAME = "plugin.properties";
    private static ReportPluginManager instance;
    private Properties pluginProperties;

    ReportPluginManager() {
        pluginProperties = new Properties();
    }

    public static ReportPluginManager getInstance() {
        return instance;
    }

    public static void init(String basePath) throws Exception {
        instance = new ReportPluginManager();
        instance.loadProperties(basePath);
        if (instance.pluginProperties.isEmpty()) {
            throw new Exception("Could not initialize plugins");
        }
    }

    public IReportPlugin getReportPlugin(String format) throws IllegalArgumentException, InvocationTargetException {
        String propertyName = "report." + format.toLowerCase();
        if (!pluginProperties.containsKey(propertyName)) {
            return null;
        }
        String pluginClassName = pluginProperties.getProperty(propertyName);
        try {
            Class<?> pluginClass = Class.forName(pluginClassName);
            Object pluginObject = pluginClass.getDeclaredConstructor().newInstance();
            if (pluginObject instanceof IReportPlugin) {
                return (IReportPlugin) pluginObject;
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException |
                 NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void loadProperties(String basePath) {
        try (FileInputStream stream = new FileInputStream(basePath + FILE_NAME)) {
            pluginProperties.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}