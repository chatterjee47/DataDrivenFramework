package ExtendedReport;

public class ConfigFileReader {

	@SuppressWarnings("unused")
	public String getReportConfigPath(){
		String reportConfigPath = "D://Wipro//CucumberFramework//extent-config.xml";
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
}
