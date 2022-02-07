package ch08;

public class MakeReport {

	StringBuffer buffer = new StringBuffer();
	
	private String line = "============================\n";
	private String title = " �̸�\t �ּ� \t\t ��ȭ��ȣ  \n";
	private void makeHeader()
	{
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	
	private void generateBody()
	{
		buffer.append("James \t");
		buffer.append("Seoul Korea \t");
		buffer.append("010-2323-2323\n");
		
		buffer.append("Tomas \t");
		buffer.append("NewYork US \t");
		buffer.append("010-3232-4424\n");
	}
	
	private void makeFooter()
	{
		buffer.append(line);
	}
	
	public String getReport()
	{
		makeHeader();
		generateBody();
		makeFooter();
		
		return buffer.toString();
	}
}