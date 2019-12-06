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

currentPassword = 'Test@123'

curentEmail = 'newsuraj10001@gmail.com'

NewEmail = 'suraj.kumar@vuclip.com'

WebUI.setText(findTestObject('change setttings/Page_theworklife - Find Great People To Work With/input_Forgot password_username'), 
    'newsuraj10001@gmail.com')

WebUI.setText(findTestObject('change setttings/Page_theworklife - Find Great People To Work With/input_Forgot password_password'), 
    currentPassword)

WebUI.click(findTestObject('change setttings/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.delay(3)

WebUI.click(findTestObject('change settings/Page_Home/i_Settings_fa fa-gear'))

WebUI.click(findTestObject('change setttings/Page_Home/a_Settings'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/change settings/Page_Settings/a_Primary Email Address_fa fa-pencil m-t-40'))

WebUI.click(findTestObject('change settings/Page_Settings/edit email button'))

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/change settings/Page_Change Primary Email/input_Current password_oldPassword'), 
    currentPassword)

WebUI.setText(findTestObject('Object Repository/change settings/Page_Change Primary Email/input_New email_email'), NewEmail)

WebUI.setText(findTestObject('Object Repository/change settings/Page_Change Primary Email/input_Confirm new email_confirm_email'), 
    NewEmail)

not_run: WebUI.click(findTestObject('change settings/save and verify email'))

WebUI.delay(2)

WebUI.closeBrowser()

