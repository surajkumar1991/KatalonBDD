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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.thework.life/')

WebUI.setText(findTestObject('Experience/Page_theworklife - Find Great People To Work With/input_Forgot password_username'), 
    'yamanappa@gmail.com')

WebUI.setEncryptedText(findTestObject('Experience/Page_theworklife - Find Great People To Work With/input_Forgot password_password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Rate/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.setText(findTestObject('Rate/Page_Home/input_View all_searchText'), 'Vijay Test')

WebUI.click(findTestObject('Rate/Page_Home/Search user button'))

WebUI.click(findTestObject('connect with user/Page_Search/button_Connect'))

WebUI.delay(5)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.delay(5)

WebUI.navigateToUrl('https://qa.thework.life/')

WebUI.setText(findTestObject('Experience/Page_theworklife - Find Great People To Work With/input_Forgot password_username'), 
    'vijayvstest01@gmail.com')

WebUI.setEncryptedText(findTestObject('Experience/Page_theworklife - Find Great People To Work With/input_Forgot password_password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Rate/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.waitForElementPresent(findTestObject('connect with user/Page_Home/a_connections'), 3)

WebUI.delay(4)

WebUI.click(findTestObject('acceptconnection/Page_Connections/a_connections'))

WebUI.click(findTestObject('acceptconnection/Page_Connections/button_Accept'))

WebUI.delay(5)

WebUI.click(findTestObject('acceptconnection/Page_Connections/a_connections'))

WebUI.delay(5)

not_run: WebUI.click(findTestObject('Object Repository/accept connection/Page_Connections/img'))

not_run: WebUI.click(findTestObject('Object Repository/accept connection/Page_Connections/button_Disconnect'))

WebUI.verifyTextPresent('No Connections available', true)

WebUI.closeBrowser()

