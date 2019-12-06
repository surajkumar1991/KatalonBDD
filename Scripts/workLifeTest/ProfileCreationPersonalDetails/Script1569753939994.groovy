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

WebUI.setText(findTestObject('Page_theworklife/input_Forgot password_username'), 'worklifetest10001@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_theworklife/input_Forgot password_password'), 'XU9cBalmEBp1UP+jEU2w4UUBUuNgBY4U')

WebUI.click(findTestObject('Page_theworklife/button_Sign in'))

WebUI.click(findTestObject('Page_Edit Profile/a_profile'))

WebUI.click(findTestObject('Page_Home/a_Edit Profile'))

WebUI.setText(findTestObject('Page_Edit Profile/input_Name_name'), ('Suraj' + System.currentTimeMillis()) + 'makhija')

WebUI.click(findTestObject('profileObject/Page_Edit Profile/button_Save'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('profileObject/Page_Edit Profile/a_OK'), 5)

WebUI.click(findTestObject('Object Repository/Page_Edit Profile/a_OK'))

WebUI.waitForElementVisible(findTestObject('Page_Home/a_profile'), 5)

WebUI.click(findTestObject('Object Repository/Page_Edit Profile/a_profile'))

WebUI.click(findTestObject('Object Repository/Page_Edit Profile/a_My Profile'))

WebUI.verifyElementPresent(findTestObject('Page_My Profile/h1_Suraj1569757068652makhija'), 0)

WebUI.closeBrowser()

