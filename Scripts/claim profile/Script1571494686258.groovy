import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.AppUrl)

WebUI.navigateToUrl(GlobalVariable.AppUrl)

WebUI.setText(findTestObject('Object Repository/Third party/Page_theworklife - Find Great People To Work With/input_Forgot password_username'), 
    'vijayvstest01@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Third party/Page_theworklife - Find Great People To Work With/input_Forgot password_password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Third party/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.setText(findTestObject('Object Repository/Third party/Page_Home/input_View all_searchText'), 'user')

WebUI.click(findTestObject('Third party/Page_Search/Search user button'))

WebUI.waitForElementVisible(findTestObject('Third party/Page_Search/span_Create their profile anonymously'), 3)

WebUI.click(findTestObject('Object Repository/Third party/Page_Search/span_Create their profile anonymously'))

WebUI.waitForElementVisible(findTestObject('Third party/Page_Search/div_(Optional)_multiple_emails-container'), 3)

WebUI.click(findTestObject('Object Repository/Third party/Page_Search/div_(Optional)_multiple_emails-container'))

WebUI.setText(findTestObject('Object Repository/Third party/Page_Search/input_Linkedin_txtLiLink'), 'appliedai' + System.currentTimeMillis())

WebUI.click(findTestObject('Object Repository/Third party/Page_Search/div_(Optional)_multiple_emails-container'))

WebUI.setText(findTestObject('Object Repository/Third party/Page_Search/input_(Optional)_multiple_emails-input text-left'), 
    'testing@appliedaiconsulting.com')

WebUI.setText(findTestObject('Object Repository/Third party/Page_Search/input_Name_txtFirstName'), 'dd' + System.currentTimeMillis())

UserToSearch = WebUI.getText(findTestObject('Third party/Page_Search/input_Name_txtFirstName'))

WebUI.click(findTestObject('Object Repository/Third party/Page_Search/button_Add'))

WebUI.waitForElementClickable(findTestObject('Third party/Page_Search/a_OK'), 3)

sleep(4000)

WebUI.click(findTestObject('Third party/Page_Search/a_OK'))

WebUI.closeBrowser()

WebUI.openBrowser(GlobalVariable.AppUrl)

WebUI.navigateToUrl(GlobalVariable.AppUrl)

WebUI.click(findTestObject('Object Repository/Page_theworklife - Find Great People To Work With/a_Join Now'))

WebUI.waitForElementPresent(findTestObject('Page_theworklife - Find Great People To Work With/button_LinkedIn'), 5)

WebUI.click(findTestObject('Object Repository/Page_theworklife - Find Great People To Work With/button_LinkedIn'))

WebUI.setText(findTestObject('Object Repository/Page_LinkedIn Login Sign in  LinkedIn/input_Welcome Back_session_key'), 
    'testing@appliedaiconsulting.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_LinkedIn Login Sign in  LinkedIn/input_Welcome Back_session_password'), 
    'YpWQ2DI2eLzqZleLDbTOWw==')

WebUI.click(findTestObject('Object Repository/Page_LinkedIn Login Sign in  LinkedIn/span_Show'))

WebUI.click(findTestObject('Object Repository/Page_LinkedIn Login Sign in  LinkedIn/button_Sign in'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Sign Up/input_Username_username'), 'testingLink' + System.currentTimeMillis())

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign Up/input_Password_password'), 'YpWQ2DI2eLzqZleLDbTOWw==')

WebUI.click(findTestObject('Object Repository/Page_Sign Up/i_Strong_cr-icon fa fa-check'))

WebUI.click(findTestObject('Object Repository/Page_Sign Up/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_LinkedIn Username/u_Click here'))

WebUI.setText(findTestObject('Object Repository/Page_LinkedIn Username/input_Click here_li_user_link'), 'https://www.linkedin.com/in/applied-ai-ab4367194/')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_LinkedIn Username/button_Submit'))

WebUI.waitForElementPresent(findTestObject('Page_LinkedIn Username/u_Click here_1'), 2)

WebUI.scrollToElement(findTestObject('Page_LinkedIn Username/u_Click here_1'), 2)

sleep(7000)

WebUI.waitForElementNotPresent(findTestObject('Experience/Page_Edit Profile/loader'), 5)

WebUI.click(findTestObject('Object Repository/Page_LinkedIn Username/u_Click here_1'))

WebUI.click(findTestObject('Object Repository/Page_LinkedIn Username/a_Finish'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Rate/Page_Home/input_View all_searchText'), 2)

WebUI.setText(findTestObject('Object Repository/Rate/Page_Home/input_View all_searchText'), UserToSearch)

WebUI.waitForElementPresent(findTestObject('Rate/Page_Home/Search user button'), 3)

WebUI.click(findTestObject('Search user/Search user button'))

WebUI.click(findTestObject('claim/Page_Search/div_dd1571555909290'))

WebUI.click(findTestObject('Object Repository/claim/Page_View Profile/button_Claim'))

WebUI.click(findTestObject('Object Repository/claim/Page_Edit Profile/span'))

WebUI.click(findTestObject('Object Repository/claim/Page_Edit Profile/button_Save'))

WebUI.click(findTestObject('Object Repository/claim/Page_Edit Profile/a_OK'))

WebUI.click(findTestObject('Object Repository/claim/Page_Edit Profile/i_No connection requests available_fa fa-bell'))

code = WebUI.getText(findTestObject('Object Repository/claim/Page_Edit Profile/b_jhm68x'))

WebUI.closeBrowser()

WebUI.openBrowser(GlobalVariable.AppUrl)

WebUI.navigateToUrl(GlobalVariable.AppUrl)

WebUI.setText(findTestObject('Object Repository/Page_theworklife - Find Great People To Work With/input_Forgot password_username'), 
    'testverification1@thework.life')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_theworklife - Find Great People To Work With/input_Forgot password_password'), 
    'JgOuj8sM3IgE5J2WfVow4w==')

WebUI.click(findTestObject('Object Repository/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.click(findTestObject('Object Repository/claim/Page_Verify Facebook User/span'))

WebUI.setText(findTestObject('Object Repository/claim/Page_Verify Facebook User/input_Verification Code_v_Code'), code)

WebUI.setText(findTestObject('Object Repository/claim/Page_Verify Facebook User/input_Verification Link_fb_verificationLink'), 
    'https://www.linkedin.com/in/applied-ai-ab4367194/')

WebUI.click(findTestObject('Object Repository/claim/Page_Verify Facebook User/button_Submit'))

WebUI.closeBrowser()

WebUI.openBrowser(GlobalVariable.AppUrl)

WebUI.navigateToUrl(GlobalVariable.AppUrl)

WebUI.setText(findTestObject('Object Repository/Page_theworklife - Find Great People To Work With/input_Forgot password_username'), 
    'testing@appliedaiconsulting.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_theworklife - Find Great People To Work With/input_Forgot password_password'), 
    'YpWQ2DI2eLzqZleLDbTOWw==')

WebUI.click(findTestObject('Object Repository/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.setText(findTestObject('Object Repository/Rate/Page_Home/input_View all_searchText'), UserToSearch)

WebUI.verifyTextNotPresent('dd1', false)

WebUI.closeBrowser()

