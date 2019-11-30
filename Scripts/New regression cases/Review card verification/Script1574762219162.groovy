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

WebUI.setText(findTestObject('Object Repository/Review card/Page_theworklife - Find Great People To Work With/input_Forgot password_username (1)'), 
    'worklifetest10001@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Review card/Page_theworklife - Find Great People To Work With/input_Forgot password_password (1)'), 
    'XU9cBalmEBp1UP+jEU2w4UUBUuNgBY4U')

WebUI.click(findTestObject('Object Repository/Review card/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Review card/Page_Home/a_connections'))

WebUI.click(findTestObject('Object Repository/Review card/Page_Connections/div_Yamanappa Ogennavar'))

WebUI.verifyTextPresent('Anonymous', true)

WebUI.verifyTextPresent('Worked together at', true)

WebUI.verifyTextPresent('Read more', true)

WebUI.verifyTextPresent('Share', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/Review card/Page_View Profile/i_Read more_fa fa-thumbs-o-up'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Review card/Page_View Profile/i_Read more_fa fa-thumbs-o-down'))

WebUI.closeBrowser()

