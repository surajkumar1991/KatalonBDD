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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.thework.life/')

WebUI.setText(findTestObject('Object Repository/follow/Page_theworklife - Find Great People To Work With/input_Forgot password_username'), 
    'vijayvstest01@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/follow/Page_theworklife - Find Great People To Work With/input_Forgot password_password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/follow/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.setText(findTestObject('Object Repository/follow/Page_Home/input_View all_searchText'), 'suraj kumar')

WebUI.click(findTestObject('Object Repository/follow/Page_Home/img'))

WebUI.click(findTestObject('Object Repository/follow/Page_Search/div_suraj kumar'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/follow/Page_View Profile/button_Follow'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/follow/Page_View Profile/button_Unfollow'))

WebUI.closeBrowser()

