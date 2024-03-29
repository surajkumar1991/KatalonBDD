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

WebUI.click(findTestObject('Object Repository/Page_theworklife - Find Great People To Work With/a_Join Now'))

WebUI.click(findTestObject('Object Repository/Page_theworklife - Find Great People To Work With/button_LinkedIn'))

WebUI.setText(findTestObject('Object Repository/Page_LinkedIn Login Sign in  LinkedIn/input_Welcome Back_session_key'), 
    'testing@appliedaiconsulting.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_LinkedIn Login Sign in  LinkedIn/input_Welcome Back_session_password'), 
    'YpWQ2DI2eLzqZleLDbTOWw==')

WebUI.click(findTestObject('Object Repository/Page_LinkedIn Login Sign in  LinkedIn/span_Show'))

WebUI.click(findTestObject('Object Repository/Page_LinkedIn Login Sign in  LinkedIn/button_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Sign Up/input_Username_username'), 'testing5')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign Up/input_Password_password'), 'YpWQ2DI2eLzqZleLDbTOWw==')

WebUI.click(findTestObject('Object Repository/Page_Sign Up/i_Strong_cr-icon fa fa-check'))

WebUI.click(findTestObject('Object Repository/Page_Sign Up/button_Continue'))

WebUI.rightClick(findTestObject('Object Repository/Page_LinkedIn Username/u_Click here'))

WebUI.setText(findTestObject('Object Repository/Page_LinkedIn Username/input_Click here_li_user_link'), 'https://www.linkedin.com/in/applied-ai-ab4367194/')

WebUI.click(findTestObject('Object Repository/Page_LinkedIn Username/button_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_LinkedIn Username/u_Click here_1'))

WebUI.switchToWindowTitle('LinkedIn Username')

WebUI.click(findTestObject('Object Repository/Page_LinkedIn Username/a_Finish'))

WebUI.closeBrowser()

