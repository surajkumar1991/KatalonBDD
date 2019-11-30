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

WebUI.setText(findTestObject('Object Repository/flag a post/Page_theworklife - Find Great People To Work With/input_Forgot password_username'), 
    'worklifetest10001@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/flag a post/Page_theworklife - Find Great People To Work With/input_Forgot password_password'), 
    'XU9cBalmEBp1UP+jEU2w4UUBUuNgBY4U')

WebUI.click(findTestObject('Object Repository/flag a post/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.delay(4)

WebUI.click(findTestObject('flag a post/Page_Home/click flag report'))

WebUI.waitForElementPresent(findTestObject('flag a post/Page_Home/Report New window'), 3)

WebUI.waitForElementClickable(findTestObject('flag a post/Page_Home/click accusatory'), 3)

WebUI.click(findTestObject('flag a post/Page_Home/click accusatory'))

WebUI.setText(findTestObject('Object Repository/flag a post/Page_Home/textarea_Detail your complaint_txtDetailReport'), 
    'ssgsssfsfsfsffsfsfsfsf')

WebUI.click(findTestObject('Object Repository/flag a post/Page_Home/button_Submit'))

WebUI.click(findTestObject('Object Repository/flag a post/Page_Home/a_OK'))

WebUI.closeBrowser()
