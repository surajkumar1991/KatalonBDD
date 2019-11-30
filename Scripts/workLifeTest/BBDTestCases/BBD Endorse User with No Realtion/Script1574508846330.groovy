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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser(GlobalVariable.AppUrl)

WebUI.navigateToUrl(GlobalVariable.AppUrl)

WebUI.setText(findTestObject('Object Repository/Endorse skills/Page_theworklife - Find Great People To Work With/input_Forgot password_username'), 
    'worklifetest10004@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Endorse skills/Page_theworklife - Find Great People To Work With/input_Forgot password_password'), 
    'XU9cBalmEBp1UP+jEU2w4UUBUuNgBY4U')

WebUI.click(findTestObject('Object Repository/Rate/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.setText(findTestObject('Object Repository/Endorse skills/Page_Home/input_View all_searchText'), 'vijay')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Endorse skills/Page_Search/div_Vijay Test'))

WebUI.click(findTestObject('Endorse skills/Page_Search/search vijay test'))

WebUI.click(findTestObject('Object Repository/Endorse skills/Page_View Profile/span_Endorse Skills'))

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('BDDFolder/ConnectNoRealtionShip/EstablishRealtaionOptionConnectioncase'))

WebUI.closeBrowser()

