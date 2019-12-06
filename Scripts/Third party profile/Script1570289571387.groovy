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

WebUI.openBrowser(GlobalVariable.ProdAppUrl)

WebUI.navigateToUrl('https://www.thework.life/')

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

WebUI.setText(findTestObject('Object Repository/Third party/Page_Search/input_Name_txtFirstName'), 'user' + System.currentTimeMillis())

WebUI.click(findTestObject('Object Repository/Third party/Page_Search/button_Add'))

WebUI.waitForElementClickable(findTestObject('Third party/Page_Search/a_OK'), 3)

sleep(4000)

WebUI.click(findTestObject('Third party/Page_Search/a_OK'))

WebUI.closeBrowser()

