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

WebUI.setText(findTestObject('Object Repository/DeletionObject/Page_theworklife - Find Great People To Work With/input_Forgot password_username'), 
    'worklifetest10002@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/DeletionObject/Page_theworklife - Find Great People To Work With/input_Forgot password_password'), 
    'XU9cBalmEBp1UP+jEU2w4UUBUuNgBY4U')

WebUI.click(findTestObject('Experience/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.click(findTestObject('Object Repository/DeletionObject/Page_Home/i_Settings_fa fa-gear'))

WebUI.click(findTestObject('Object Repository/DeletionObject/Page_Home/a_Settings'))

WebUI.click(findTestObject('Object Repository/DeletionObject/Page_Settings/a_Account Basics'))

WebUI.click(findTestObject('Object Repository/DeletionObject/Page_Settings/a_Delete Account'))

WebUI.setEncryptedText(findTestObject('Object Repository/DeletionObject/Page_Settings/input_Enter your password to confirm_password'), 
    'XU9cBalmEBp1UP+jEU2w4UUBUuNgBY4U')

WebUI.click(findTestObject('Object Repository/DeletionObject/Page_Settings/a_Delete'))

WebUI.waitForElementClickable(findTestObject('DeletionObject/Page_Settings/a_OK'), 0)

WebUI.waitForElementVisible(findTestObject('DeletionObject/Page_Settings/a_OK'), 0)

WebUI.click(findTestObject('Object Repository/DeletionObject/Page_Settings/a_OK'))

