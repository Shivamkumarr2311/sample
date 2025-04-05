import java.io.IOException;

import com.comcast.crm.ORutility.HomePage;
import com.comcast.crm.generic.fileutility.ExcelUtility;

public class CreateProductTest {
	
	@Test (groups = "SmokeTest")
	public void ProductTest() throws IOException {

		

		JavaUtility jLib = new JavaUtility();      // geneating random numbes
		int randomNum = jLib.getRandomNumber();
		
		ExcelUtility eLib = new ExcelUtility();   // getting data om excel sheet
		String product_name = eLib.getDataFromExcel("Sheet2", 1, 2) + randomNum;

		HomePage hp = new HomePage(driver);             //creating product 
		hp.getOrglink().click();
		OrganizationsPage orgpage = new OrganizationsPage(driver);
		orgpage.getOrgImg().click();
		CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
		cnop.createOrg(org_name);

		OrganizationInformationPage orginfopage = new OrganizationInformationPage(driver);    // verification
		String actorgInfo = orginfopage.getHeaderMsg().getText();
		if (actorgInfo.contains(org_name)) {
			System.out.println(org_name + "\t" + "name is verifed==PASS===");
		} else {
			System.out.println(org_name + "  " + "name is not verifed==FAIL===");
		}
	}


}
