package demopracpackage;

import com.qount.qa.base.TestBaseSetup;
import com.qount.qa.listeners.MyListeners;
import login.LoginWebPage;
import org.testng.ITestListener;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pracdemopackage.PracDemoPage;
import proposalspackage.ProposalStatusPage;

@Listeners(MyListeners.class)
@Test
public class demopractest extends TestBaseSetup implements ITestListener {
    LoginWebPage loginwebkey;
    PracDemoPage pracdemokey;
    ProposalStatusPage proposalfunkey;
    //   WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void setpracdemo() throws Exception {// InterruptedException, IOException {
        loginwebkey = new LoginWebPage(driver);
        pracdemokey = new PracDemoPage(driver);
        proposalfunkey = new ProposalStatusPage(driver);
    }

    //   @Test(priority = 1)
    //   public void pracwebpage() throws Exception {
    //       pracdemokey.GoToPage();
    //   }

    @Test(priority = 2)
    public void wallmanage() throws Exception {
        pracdemokey.PracWall();
    }

    @Test(priority = 3)
    public void proposalview() throws Exception {//InterruptedException, IOException {//Exception {
        loginwebkey.loginqountweb();
        //       pracdemokey.PracWall();
        pracdemokey.ViewProposal();
        proposalfunkey.Proposaltabs();
        loginwebkey.wallhome();
        loginwebkey.logoutqountweb();
    }
}