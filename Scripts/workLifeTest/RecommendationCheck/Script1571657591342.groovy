import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.thework.life/')

WebUI.setText(findTestObject('Object Repository/RecommandationCheck/Page_theworklife - Find Great People To Work With/input_Forgot password_username'), 
    'vijayvstest01@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/RecommandationCheck/Page_theworklife - Find Great People To Work With/input_Forgot password_password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/RecommandationCheck/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.click(findTestObject('Object Repository/RecommandationCheck/Page_Home/a_profile'))

WebUI.click(findTestObject('Object Repository/RecommandationCheck/Page_Home/a_Edit Profile'))

WebUI.click(findTestObject('Object Repository/RecommandationCheck/Page_Edit Profile/a_Recommendations'))

WebUI.waitForElementVisible(findTestObject('RecommandationCheck/Page_Edit Profile/a_Submitted (1)'), 5)

WebUI.click(findTestObject('Object Repository/RecommandationCheck/Page_Edit Profile/a_Submitted (1)'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Object Repository/RecommandationCheck/Page_Edit Profile/a_Suraj1571562559339makhija'), 
    10)

WebUI.verifyElementVisible(findTestObject('Object Repository/RecommandationCheck/Page_Edit Profile/a_Suraj1571562559339makhija'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/RecommandationCheck/Page_Edit Profile/a_Received (2)'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Object Repository/RecommandationCheck/Page_Edit Profile/a_Yamanappa Ogennavar'), 
    10)

WebUI.verifyElementVisible(findTestObject('Object Repository/RecommandationCheck/Page_Edit Profile/a_Yamanappa Ogennavar'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

