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

WebUI.openBrowser(GlobalVariable.ProdAppUrl)

WebUI.navigateToUrl('https://www.thework.life/')

WebUI.setText(findTestObject('Object Repository/Endorse skills/Page_theworklife - Find Great People To Work With/input_Forgot password_username'), 
    'worklifetest10001@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Endorse skills/Page_theworklife - Find Great People To Work With/input_Forgot password_password'), 
    'XU9cBalmEBp1UP+jEU2w4UUBUuNgBY4U')

WebUI.click(findTestObject('Object Repository/Rate/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.setText(findTestObject('Object Repository/Endorse skills/Page_Home/input_View all_searchText'), ' vijay test')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Endorse skills/Page_Search/div_Vijay Test'))

WebUI.click(findTestObject('Endorse skills/Page_Search/search vijay test'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Endorse skills/Page_View Profile/span_Endorse Skills'))

not_run: WebUI.delay(5)

not_run: WebUI.waitForElementClickable(findTestObject('Endorse skills/click on endorse skill'), 5)

not_run: WebUI.click(findTestObject('Endorse skills/click on endorse skill'))

WebUI.delay(5)

WebUI.click(findTestObject('Endorse skills/Page_View Profile/button_Endorse'))

WebUI.waitForElementClickable(findTestObject('Endorse skills/Page_View Profile/a_OK'), 5)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Endorse skills/Page_View Profile/a_OK'))

WebUI.closeBrowser()

