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

WebUI.openBrowser(GlobalVariable.ProdAppUrl)

WebUI.navigateToUrl('https://www.thework.life/')

WebUI.setText(findTestObject('Object Repository/Page_theworklife/input_Forgot password_username'), 'jsgifuwidw@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_theworklife/input_Forgot password_password'), 'I24EpPs9VQ1LZoTHit0ojg==')

WebUI.click(findTestObject('Object Repository/Page_theworklife/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_theworklife/span_Username or Email ID does not exist'))

WebUI.verifyElementText(findTestObject('Page_theworklife/span_Username or Email ID does not exist'), 'Username or Email ID does not exist!')

WebUI.closeBrowser()

