package htmlreport1014;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;

import com.report.entry.ReportEntry;
import com.report.html.HtmlFile;
import com.report.html.HtmlFileGlobal;

/**
 * Using <code>Suite</code> as a runner allows you to manually
 * build a suite containing tests from many classes. It is the JUnit 4 equivalent of the JUnit 3.8.x
 * static {@link junit.framework.Test} <code>suite()</code> method. To use it, annotate a class
 * with <code>@RunWith(Suite.class)</code> and <code>@SuiteClasses({TestClass1.class, ...})</code>.
 * When you run this class, it will run all the tests in all the suite classes.
 *
 * @since 4.0
 */
public class KevinSuite extends Suite {
	

	public KevinSuite(Class<?> klass, RunnerBuilder builder) throws InitializationError {
		super(klass, builder);
		// TODO Auto-generated constructor stub
	}
    
    @Override
    public void run(final RunNotifier notifier) {
    	System.out.println("start>>>>>>");
    	HtmlFileGlobal.createLog("e:\\myReport22.html");
        super.run(notifier);
        HtmlFileGlobal.closeLog();
        System.out.println("end>>>>>>");
    }
}
