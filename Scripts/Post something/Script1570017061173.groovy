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

WebUI.setText(findTestObject('Object Repository/Post case/Page_theworklife - Find Great People To Work With/input_Forgot password_username'), 
    'surajkumarsrivastava1991')

WebUI.setEncryptedText(findTestObject('Object Repository/Post case/Page_theworklife - Find Great People To Work With/input_Forgot password_password'), 
    'nzEsFCGA/BtMPXLkTTMM4w==')

WebUI.click(findTestObject('Object Repository/Post case/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.setText(findTestObject('Object Repository/Post case/Page_Home/textarea_suraj kumar_txtUserPost'), 'Hello my name is uraj')

WebUI.click(findTestObject('Object Repository/Post case/Page_Home/button_post'))

WebUI.verifyElementVisible(findTestObject('Post case/Page_Home/p_Hello my name is uraj'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

