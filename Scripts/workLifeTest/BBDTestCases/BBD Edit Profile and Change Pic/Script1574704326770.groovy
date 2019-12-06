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

WebUI.openBrowser(GlobalVariable.ProdAppUrl)

WebUI.navigateToUrl(GlobalVariable.ProdAppUrl)

WebUI.setText(findTestObject('Object Repository/SkillPageObject/Page_theworklife - Find Great People To Work With/input_Forgot password_username'), 
    'worklifetest10004@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/SkillPageObject/Page_theworklife - Find Great People To Work With/input_Forgot password_password'), 
    'XU9cBalmEBp1UP+jEU2w4UUBUuNgBY4U')

WebUI.click(findTestObject('Object Repository/SkillPageObject/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.click(findTestObject('Object Repository/SkillPageObject/Page_Home/a_profile'))

WebUI.click(findTestObject('Object Repository/SkillPageObject/Page_Home/a_Edit Profile'))

WebUI.click(findTestObject('BDDFolder/Change Pic/change Pic Button'))

WebUI.verifyElementClickable(findTestObject('BDDFolder/Change Pic/BrowseButton'))

