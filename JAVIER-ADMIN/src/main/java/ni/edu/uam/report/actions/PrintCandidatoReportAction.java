package ni.edu.uam.report.actions;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import org.openxava.actions.JasperReportBaseAction;

import java.util.Map;

public class PrintCandidatoReportAction extends JasperReportBaseAction {
    @Override
    protected JRDataSource getDataSource() throws Exception {
        return new JREmptyDataSource();
    }

    @Override
    protected String getJRXML() throws Exception {
        return "JavierReportsCandidato.jrxml";
    }

    @Override
    protected Map getParameters() throws Exception {
        return null;
    }
}
