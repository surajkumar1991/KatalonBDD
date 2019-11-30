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

WebUI.setText(findTestObject('Object Repository/share profile SMN email/Page_theworklife - Find Great People To Work With/input_Forgot password_username'), 
    'worklifetest10001@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_theworklife - Find Great People To Work With/input_Password does not match_password'), 
    'XU9cBalmEBp1UP+jEU2w4UUBUuNgBY4U')

WebUI.click(findTestObject('Object Repository/share profile SMN email/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Home/click 3 dots to share'))

WebUI.click(findTestObject('Object Repository/Page_Home/li_Share Profile'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Home/i__fa fa-facebook'))

WebUI.click(findTestObject('Object Repository/Page_Home/img'))

WebUI.click(findTestObject('Object Repository/Page_Home/li_Share Profile'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Home/i__fa fa-linkedin'))

WebUI.click(findTestObject('Object Repository/Page_Home/img'))

WebUI.click(findTestObject('Object Repository/Page_Home/li_Share Profile'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Home/i__fa fa-twitter'))

WebUI.click(findTestObject('Object Repository/Page_Home/img'))

WebUI.click(findTestObject('Object Repository/Page_Home/li_Share Profile'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Home/i__fa fa-whatsapp my-float'))

WebUI.click(findTestObject('Object Repository/Page_Home/img'))

WebUI.click(findTestObject('Object Repository/Page_Home/li_Share Profile'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Home/i__fa fa-envelope'))

WebUI.click(findTestObject('Object Repository/Page_Home/div_Copy share link_multiple_emails-container'))

WebUI.click(findTestObject('Object Repository/Page_Home/button_Cancel'))

WebUI.click(findTestObject('Page_Home/click 3 dots to share'))

WebUI.click(findTestObject('Object Repository/Page_Home/li_Share Profile'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Home/i__fa fa-envelope'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/share profile SMN email/Page_Home/div_Copy share link_multiple_emails-container'))

WebUI.setText(findTestObject('Object Repository/share profile SMN email/Page_Home/input_Copy share link_multiple_emails-input text-left'), 
    'suraj.kumar@vuclip.com')

WebUI.click(findTestObject('Object Repository/share profile SMN email/Page_Home/button_Share (1)'))

WebUI.click(findTestObject('Object Repository/share profile SMN email/Page_Home/a_OK (1)'))

WebUI.closeBrowser()

