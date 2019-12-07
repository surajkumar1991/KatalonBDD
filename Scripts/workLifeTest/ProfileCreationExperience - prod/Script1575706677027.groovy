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

String DesignationName = 'abcd' + System.currentTimeMillis()

WebUI.openBrowser(GlobalVariable.ProdAppUrl)

WebUI.navigateToUrl('https://www.thework.life/')

WebUI.setText(findTestObject('Page_theworklife/input_Forgot password_username'), 'worklifetest10001@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_theworklife/input_Forgot password_password'), 'XU9cBalmEBp1UP+jEU2w4UUBUuNgBY4U')

WebUI.click(findTestObject('Page_theworklife/button_Sign in'))

WebUI.navigateToUrl('https://qa.thework.life/Profile/EditProfile')

WebUI.click(findTestObject('Page_Edit Profile/a_Experience'))

WebUI.waitForElementNotPresent(findTestObject('Experience/Page_Edit Profile/loader'), 10)

WebUI.click(findTestObject('Object Repository/Page_Edit Profile/button_ Add Experience'))

WebUI.setText(findTestObject('Object Repository/Page_Edit Profile/input_Designation_designation_name'), DesignationName)

WebUI.setText(findTestObject('Object Repository/Page_Edit Profile/input_Company_company_name'), 'abcd')

WebUI.setText(findTestObject('Object Repository/Page_Edit Profile/input_Location_location'), 'abcd')

WebUI.setText(findTestObject('Object Repository/Page_Edit Profile/textarea_(Optional)_description'), 'abcd')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Edit Profile/select_Month'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Edit Profile/select_Year'), '2000', true)

WebUI.click(findTestObject('Object Repository/Page_Edit Profile/i_I currently work here_cr-icon fa fa-check'))

WebUI.click(findTestObject('Object Repository/Page_Edit Profile/span_Work-life balance_star5'))

WebUI.click(findTestObject('Object Repository/Page_Edit Profile/span_Equal opportunities_star5'))

WebUI.click(findTestObject('Object Repository/Page_Edit Profile/span_Transparency_star5'))

WebUI.click(findTestObject('Object Repository/Page_Edit Profile/button_Save'))

WebUI.verifyElementText(findTestObject('Page_Edit Profile/h1_abcd', [('text') : DesignationName]), DesignationName)

WebUI.closeBrowser()

