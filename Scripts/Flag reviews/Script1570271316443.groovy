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

WebUI.setText(findTestObject('Object Repository/flag review/Page_theworklife - Find Great People To Work With/input_Forgot password_username'), 
    'vijayvstest01@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/flag review/Page_theworklife - Find Great People To Work With/input_Forgot password_password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Rate/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.click(findTestObject('flag review/Click profile'))

WebUI.click(findTestObject('flag review/click myprofile'))

WebUI.waitForElementClickable(findTestObject('flag review/Page_View Profile/span_Report'), 3)

WebUI.click(findTestObject('Object Repository/flag review/Page_View Profile/span_Report'))

WebUI.click(findTestObject('flag review/Page_View Profile/click btn-btn report'))

WebUI.waitForElementPresent(findTestObject('flag review/Page_theworklife - Find Great People To Work With/Report New window'), 
    3)

WebUI.waitForElementClickable(findTestObject('flag review/Page_View Profile/label_Accusatory'), 3)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/flag review/Page_View Profile/label_Accusatory'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/flag review/Page_View Profile/textarea_Detail your complaint_txtDetailReport'), 
    'i dont like it , i am testing flag reviews')

WebUI.click(findTestObject('Object Repository/flag review/Page_View Profile/button_Submit'))

WebUI.waitForElementClickable(findTestObject('flag review/Page_View Profile/a_OK'), 3)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/flag review/Page_View Profile/a_OK'))

WebUI.closeBrowser()

