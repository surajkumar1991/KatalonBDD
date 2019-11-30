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

WebUI.click(findTestObject('Object Repository/email already exist -signup/Page_theworklife - Find Great People To Work With/a_Join Now'))

WebUI.click(findTestObject('Object Repository/email already exist -signup/Page_theworklife - Find Great People To Work With/button_LinkedIn'))

WebUI.setText(findTestObject('Object Repository/email already exist -signup/Page_LinkedIn Login Sign in  LinkedIn/input_Welcome Back_session_key'), 
    'worklifetest10001@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/email already exist -signup/Page_LinkedIn Login Sign in  LinkedIn/input_Welcome Back_session_password'), 
    'XU9cBalmEBp1UP+jEU2w4UUBUuNgBY4U')

WebUI.click(findTestObject('Object Repository/email already exist -signup/Page_LinkedIn Login Sign in  LinkedIn/button_Sign in'))

WebUI.verifyTextPresent('You are already registered.Please try with login', false)

WebUI.click(findTestObject('Object Repository/email already exist -signup/Page_theworklife - Find Great People To Work With/a_OK'))

WebUI.closeBrowser()

