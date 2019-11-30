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

WebUI.setText(findTestObject('Object Repository/skip verification/Page_theworklife - Find Great People To Work With/input_Please enter username or email_username'), 
    'newsuraj10001@gmail.com')

WebUI.setText(findTestObject('Object Repository/skip verification/Page_theworklife - Find Great People To Work With/input_Forgot password_username'), 
    'newsuraj10001@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/skip verification/Page_theworklife - Find Great People To Work With/input_Forgot password_password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/skip verification/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.click(findTestObject('Object Repository/skip verification/Page_LinkedIn Username/button_Do it Later'))

WebUI.click(findTestObject('Object Repository/skip verification/Page_LinkedIn Username/a_Skip anyway'))

WebUI.click(findTestObject('Object Repository/skip verification/Page_Home/button_No connection requests available_btn dropdown-toggle'))

WebUI.closeBrowser()

