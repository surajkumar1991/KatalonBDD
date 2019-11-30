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

WebUI.openBrowser(GlobalVariable.AppUrl)

WebUI.navigateToUrl(GlobalVariable.AppUrl)

WebUI.click(findTestObject('Object Repository/FacebookLogin/Page_theworklife - Find Great People To Work With/a_Join Now'))

WebUI.click(findTestObject('Object Repository/FacebookLogin/Page_theworklife - Find Great People To Work With/div_ Register to theworklife'))

WebUI.click(findTestObject('Object Repository/FacebookLogin/Page_theworklife - Find Great People To Work With/button_Facebook'))

WebUI.delay(2)

WebUI.switchToWindowTitle('Facebook')

WebUI.waitForElementClickable(findTestObject('FacebookLogin/Page_Facebook/input_Email address or phone number_email'), 5)

WebUI.clearText(findTestObject('FacebookLogin/Page_Facebook/input_Email address or phone number_email'))

WebUI.setText(findTestObject('FacebookLogin/Page_Facebook/input_Email address or phone number_email'), 'worklifetest10002@gmail.com')

WebUI.setEncryptedText(findTestObject('FacebookLogin/Page_Facebook/input_Password_pass'), 'XU9cBalmEBp1UP+jEU2w4UUBUuNgBY4U')

WebUI.click(findTestObject('FacebookLogin/Page_Facebook/input_Password_login'))

WebUI.delay(12)

WebUI.switchToWindowTitle('Sign Up')

WebUI.delay(12)

WebUI.waitForElementClickable(findTestObject('FacebookLogin/Page_Sign Up/input_Username_username'), 5)

WebUI.setText(findTestObject('FacebookLogin/Page_Sign Up/input_Username_username'), 'testing' + System.currentTimeMillis())

WebUI.setEncryptedText(findTestObject('FacebookLogin/Page_Sign Up/input_Password_password'), 'XU9cBalmEBp1UP+jEU2w4UUBUuNgBY4U')

WebUI.click(findTestObject('FacebookLogin/Page_Sign Up/i_Very Strong_cr-icon fa fa-check'))

WebUI.click(findTestObject('FacebookLogin/Page_Sign Up/button_Continue'))

WebUI.click(findTestObject('Object Repository/FacebookLogin/Page_Facebook Username/u_Click here'))

WebUI.switchToWindowTitle('Facebook Username')

WebUI.setText(findTestObject('FacebookLogin/Page_Facebook Username/input_Click here_fb_username'), 'https://www.facebook.com/jiten.makhija.125#_')

WebUI.click(findTestObject('Object Repository/FacebookLogin/Page_Facebook Username/button_Submit'))

WebUI.waitForElementClickable(findTestObject('FacebookLogin/Page_Facebook Username/u_Click here_1'), 5)

WebUI.waitForElementNotPresent(findTestObject('Experience/Page_Edit Profile/loader'), 5)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/FacebookLogin/Page_Facebook Username/u_Click here_1'))

WebUI.click(findTestObject('Object Repository/FacebookLogin/Page_Facebook Username/a_Finish'))

WebUI.waitForElementVisible(findTestObject('FacebookLogin/Page_Home/div_Application Guide'), 5)

WebUI.click(findTestObject('Object Repository/FacebookLogin/Page_Home/div_Application Guide'))

WebUI.click(findTestObject('Object Repository/FacebookLogin/Page_Home/button_Skip'))

