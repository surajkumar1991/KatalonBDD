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

WebUI.click(findTestObject('Object Repository/Incorrect SMN FB/Page_theworklife - Find Great People To Work With/a_Join Now'))

WebUI.click(findTestObject('Object Repository/Incorrect SMN FB/Page_theworklife - Find Great People To Work With/button_Facebook'))

WebUI.switchToWindowTitle('Facebook')

WebUI.setText(findTestObject('Object Repository/Incorrect SMN FB/Page_Facebook/input_Email address or phone number_email'), 
    'an@ksfks.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Incorrect SMN FB/Page_Facebook/input_Password_pass'), 'FIyHSpwHMz/RrAsWal25wQ==')

WebUI.click(findTestObject('Object Repository/Incorrect SMN FB/Page_Facebook/input_Password_login'))

WebUI.click(findTestObject('Object Repository/Incorrect SMN FB/Page_Facebook/div_Incorrect email addressThe email address that youve entered doesnt match any account Sign up for an account'))

WebUI.verifyTextPresent('Incorrect email address', false)

WebUI.closeBrowser()

