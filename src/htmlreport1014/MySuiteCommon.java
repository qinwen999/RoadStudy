package htmlreport1014;



import com.report.html.HtmlFileGlobal;
import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;
import junit.framework.TestSuite;

public class MySuiteCommon {
	
	public static class TestSuite1 {  
		public static Test suite() {  
		TestSuite suite = new TestSuite("Test for package1");  
		  
		suite.addTest(new JUnit4TestAdapter(TestCase2.class)); 
		suite.addTest(new JUnit4TestAdapter(TestCase3.class));  
		
		return suite;  
		}  
		}  
	
	 public static void main(String[] args) throws Exception{
		 //�ӷ��� �Զ������Գ�ʼ��
		 HtmlFileGlobal.createLog("d:\\myReport4.html");
         junit.textui.TestRunner.run(TestSuite1.suite());
         HtmlFileGlobal.closeLog();
         //�ӷ��� ��������
         //�ӷ��������ʼ�
    

}
	 
	
	 
}
