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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.thework.life/')

WebUI.setText(findTestObject('Object Repository/verification fail/Page_theworklife - Find Great People To Work With/input_Forgot password_username'), 
    'testverification1@thework.life')

WebUI.setEncryptedText(findTestObject('Object Repository/verification fail/Page_theworklife - Find Great People To Work With/input_Forgot password_password'), 
    'JgOuj8sM3IgE5J2WfVow4w==')

WebUI.click(findTestObject('Object Repository/verification fail/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.click(findTestObject('Object Repository/verification fail/Page_Verify Facebook User/span'))

WebUI.setText(findTestObject('Object Repository/verification fail/Page_Verify Facebook User/input_Verification Link_fb_verificationLink'), 
    'https://www.linkedin.com/in/naya-suraj-428992197/')

WebUI.setText(findTestObject('Object Repository/verification fail/Page_Verify Facebook User/input_Verification Code_v_Code'), 
    '12345')

WebUI.click(findTestObject('Object Repository/verification fail/Page_Verify Facebook User/button_Submit'))

WebUI.click(findTestObject('Object Repository/verification fail/Page_Verify Facebook User/a_Logout'))

WebUI.setText(findTestObject('Object Repository/verification fail/Page_theworklife - Find Great People To Work With/input_Forgot password_username'), 
    'newsuraj10001@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/verification fail/Page_theworklife - Find Great People To Work With/input_Forgot password_password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/verification fail/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.click(findTestObject('Object Repository/verification fail/Page_Home/button_No connection requests available_btn dropdown-toggle'))

WebUI.click(findTestObject('Object Repository/verification fail/Page_Home/a_View all'))

WebUI.closeBrowser()

