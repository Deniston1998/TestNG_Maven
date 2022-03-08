import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTest implements ITestListener {


    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("TEST CASE IS GOING TO EXECUTE");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("TEST CASE IS PASSED");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("TEST CASE IS FAILED");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test CAS IS SKIPPED");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("failed in per");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println(" failed timeout");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Text cse started");
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
    }
}
