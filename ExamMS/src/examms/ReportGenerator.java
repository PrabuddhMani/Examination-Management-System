package examms;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

public class ReportGenerator {
    public static void main(String[] args) {
        try {
            // Step 1: Compile the report template
            InputStream template = ReportGenerator.class.getResourceAsStream("my_report.jrxml");
            JasperCompileManager.compileReportToFile(template, "my_report.jasper");
            
            // Step 2: Set report parameters and data sources
            Map<String, Object> parameters = new HashMap<>();
            parameters.put("parameter1", "value1");
            // ...
            
            // Step 3: Generate the report output in PDF format
            JasperPrint print = JasperFillManager.fillReport("my_report.jasper", parameters, dataSource);
            JasperExportManager.exportReportToPdfFile(print, "my_report.pdf");
            
            System.out.println("PDF report generated successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

