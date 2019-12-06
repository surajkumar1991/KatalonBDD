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

String college = 'MyCollege' + System.currentTimeMillis()

WebUI.openBrowser(GlobalVariable.ProdAppUrl)

WebUI.navigateToUrl('https://www.thework.life/')

WebUI.setText(findTestObject('EducationDetails/Page_theworklife - Find Great People To Work With/input_Forgot password_username'), 
    'worklifetest10001@gmail.com')

WebUI.setEncryptedText(findTestObject('EducationDetails/Page_theworklife - Find Great People To Work With/input_Forgot password_password'), 
    'XU9cBalmEBp1UP+jEU2w4UUBUuNgBY4U')

WebUI.click(findTestObject('EducationDetails/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.click(findTestObject('EducationDetails/Page_Home/a_profile'))

WebUI.click(findTestObject('EducationDetails/Page_Home/a_Edit Profile'))

WebUI.click(findTestObject('Object Repository/EducationDetails/Page_Edit Profile/a_Education'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('EducationDetails/Page_Edit Profile/button_ Add Education'), 3)

WebUI.click(findTestObject('EducationDetails/Page_Edit Profile/button_ Add Education'))

sleep(5000)

WebUI.waitForElementNotVisible(findTestObject('Experience/Page_Edit Profile/loader'), 5)

WebUI.waitForElementPresent(findTestObject('EducationDetails/Page_Edit Profile/DegreForm'), 5)

WebUI.setText(findTestObject('EducationDetails/Page_Edit Profile/input_Select institute_institute'), college)

WebUI.click(findTestObject('EducationDetails/Page_Edit Profile/DegreForm'))

WebUI.setText(findTestObject('Object Repository/EducationDetails/Page_Edit Profile/input_Degree_degree'), 'worklife')

WebUI.click(findTestObject('EducationDetails/Page_Edit Profile/DegreForm'))

WebUI.setText(findTestObject('Object Repository/EducationDetails/Page_Edit Profile/input_SpecialityField_specialty'), 'worklife')

WebUI.click(findTestObject('EducationDetails/Page_Edit Profile/DegreForm'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EducationDetails/Page_Edit Profile/select_Please selectYear (1)'), 
    '2008', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/EducationDetails/Page_Edit Profile/select_Please selectYear'), 
    '2002', true)

WebUI.setText(findTestObject('Object Repository/EducationDetails/Page_Edit Profile/textarea_(Optional)_description'), 'Test Description')

WebUI.click(findTestObject('EducationDetails/Page_Edit Profile/DegreForm'))

WebUI.scrollToElement(findTestObject('EducationDetails/Page_Edit Profile/button_Save'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('EducationDetails/Page_Edit Profile/button_Save'))

WebUI.delay(3)

not_run: WebUI.verifyElementText(findTestObject('EducationDetails/Page_Edit Profile/h2_MyCollege', [('college') : college]), 
    college)

