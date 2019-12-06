import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.ProdAppUrl)

WebUI.navigateToUrl(GlobalVariable.ProdAppUrl)

WebUI.setText(findTestObject('Object Repository/Page_theworklife/input_Forgot password_username'), 'worklifetest10004@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_theworklife/input_Forgot password_password'), 'XU9cBalmEBp1UP+jEU2w4UUBUuNgBY4U')

WebUI.click(findTestObject('Object Repository/Page_theworklife/button_Sign in'))

WebUI.navigateToUrl('https://qa.thework.life/Profile/EditProfile')

WebUI.click(findTestObject('Object Repository/BDDFolder/EditExeperiece/Page_Edit Profile/a_Experience'))

WebUI.waitForElementNotPresent(findTestObject('Object Repository/Experience/Page_Edit Profile/loader'), 10)

WebUI.click(findTestObject('Object Repository/BDDFolder/EditExeperiece/ClickonEditButton'))

WebUI.scrollToElement(findTestObject('Object Repository/BDDFolder/EditExeperiece/DescriptiontextBox'), 3)

WebUI.delay(5)

WebUI.click(findTestObject('BDDFolder/EditExeperiece/Page_Edit Profile/textarea_ugugih'), FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('BDDFolder/EditExeperiece/Page_Edit Profile/textarea_ugugih'))

WebUI.setText(findTestObject('Object Repository/BDDFolder/EditExeperiece/Page_Edit Profile/textarea_ugugih'), 'abcd test')

WebUI.click(findTestObject('Object Repository/BDDFolder/EditExeperiece/Page_Edit Profile/button_Save'))

WebUI.closeBrowser()

