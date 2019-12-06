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

//  Create A profile 
WebUI.openBrowser(GlobalVariable.ProdAppUrl)

WebUI.navigateToUrl(GlobalVariable.ProdAppUrl)

WebUI.click(findTestObject('Object Repository/FacebookLogin/Page_theworklife - Find Great People To Work With/a_Join Now'))

WebUI.click(findTestObject('Object Repository/FacebookLogin/Page_theworklife - Find Great People To Work With/div_ Register to theworklife'))

WebUI.click(findTestObject('Object Repository/FacebookLogin/Page_theworklife - Find Great People To Work With/button_Facebook'))

WebUI.delay(2)

WebUI.switchToWindowTitle('Facebook')

WebUI.waitForElementClickable(findTestObject('FacebookLogin/Page_Facebook/input_Email address or phone number_email'), 5)

WebUI.clearText(findTestObject('FacebookLogin/Page_Facebook/input_Email address or phone number_email'))

WebUI.setText(findTestObject('FacebookLogin/Page_Facebook/input_Email address or phone number_email'), 'worklifetest10002@gmail.com')

WebUI.setEncryptedText(findTestObject('FacebookLogin/Page_Facebook/input_Password_pass'), 'XU9cBalmEBp1UP+jEU2w4UUBUuNgBY4U')

WebUI.click(findTestObject('FacebookLogin/Page_Facebook/input_Password_login'))

sleep(5000)

WebUI.switchToWindowTitle('Sign Up')

sleep(5000)

WebUI.waitForElementClickable(findTestObject('FacebookLogin/Page_Sign Up/input_Username_username'), 5)

UserToSearch = ('testing' + System.currentTimeMillis())

println(UserToSearch)

WebUI.setText(findTestObject('FacebookLogin/Page_Sign Up/input_Username_username'), UserToSearch)

WebUI.setEncryptedText(findTestObject('FacebookLogin/Page_Sign Up/input_Password_password'), 'XU9cBalmEBp1UP+jEU2w4UUBUuNgBY4U')

WebUI.click(findTestObject('FacebookLogin/Page_Sign Up/i_Very Strong_cr-icon fa fa-check'))

WebUI.click(findTestObject('FacebookLogin/Page_Sign Up/button_Continue'))

WebUI.click(findTestObject('Object Repository/FacebookLogin/Page_Facebook Username/u_Click here'))

WebUI.switchToWindowTitle('Facebook Username')

WebUI.setText(findTestObject('FacebookLogin/Page_Facebook Username/input_Click here_fb_username'), 'https://www.facebook.com/jiten.makhija.125#_')

WebUI.click(findTestObject('Object Repository/FacebookLogin/Page_Facebook Username/button_Submit'))

sleep(10000)

WebUI.waitForElementClickable(findTestObject('FacebookLogin/Page_Facebook Username/u_Click here_1'), 5)

WebUI.waitForElementNotPresent(findTestObject('Experience/Page_Edit Profile/loader'), 5)

code = WebUI.getText(findTestObject('ReaquireObjects/codeObject'))

println(code)

WebUI.click(findTestObject('Object Repository/FacebookLogin/Page_Facebook Username/u_Click here_1'))

WebUI.click(findTestObject('Object Repository/FacebookLogin/Page_Facebook Username/a_Finish'))

WebUI.delay(5)

WebUI.closeBrowser()

// Verify Profile 
//////////////////
WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.thework.life/')

WebUI.setText(findTestObject('Object Repository/Page_theworklife - Find Great People To Work With/input_Forgot password_username'), 
    'testverification1@thework.life')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_theworklife - Find Great People To Work With/input_Forgot password_password'), 
    'JgOuj8sM3IgE5J2WfVow4w==')

WebUI.click(findTestObject('Object Repository/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.click(findTestObject('VerifyUserObjects/facebook_radioButton'))

WebUI.setText(findTestObject('VerifyUserObjects/verificationCode_textbox'), code)

WebUI.setText(findTestObject('VerifyUserObjects/FacebookVerificationLink_textBox'), 'https://www.linkedin.com/in/applied-ai-ab4367194/')

WebUI.click(findTestObject('VerifyUserObjects/VerificationPage_Submit'))

WebUI.closeBrowser()

// Delete Profile 
WebUI.openBrowser(GlobalVariable.ProdAppUrl)

WebUI.navigateToUrl(GlobalVariable.ProdAppUrl)

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

WebUI.closeBrowser()

// Re Create - and Acquire 
WebUI.openBrowser(GlobalVariable.ProdAppUrl)

WebUI.navigateToUrl(GlobalVariable.ProdAppUrl)

WebUI.click(findTestObject('Object Repository/FacebookLogin/Page_theworklife - Find Great People To Work With/a_Join Now'))

WebUI.click(findTestObject('Object Repository/FacebookLogin/Page_theworklife - Find Great People To Work With/div_ Register to theworklife'))

WebUI.click(findTestObject('Object Repository/FacebookLogin/Page_theworklife - Find Great People To Work With/button_Facebook'))

WebUI.delay(2)

WebUI.switchToWindowTitle('Facebook')

WebUI.waitForElementClickable(findTestObject('FacebookLogin/Page_Facebook/input_Email address or phone number_email'), 5)

WebUI.clearText(findTestObject('FacebookLogin/Page_Facebook/input_Email address or phone number_email'))

WebUI.setText(findTestObject('FacebookLogin/Page_Facebook/input_Email address or phone number_email'), 'worklifetest10002@gmail.com')

WebUI.setEncryptedText(findTestObject('FacebookLogin/Page_Facebook/input_Password_pass'), 'XU9cBalmEBp1UP+jEU2w4UUBUuNgBY4U')

WebUI.click(findTestObject('FacebookLogin/Page_Facebook/input_Password_login'))

WebUI.delay(5)

WebUI.switchToWindowTitle('Sign Up')

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('FacebookLogin/Page_Sign Up/input_Username_username'), 5)

WebUI.setText(findTestObject('FacebookLogin/Page_Sign Up/input_Username_username'), 'testing' + System.currentTimeMillis())

WebUI.setEncryptedText(findTestObject('FacebookLogin/Page_Sign Up/input_Password_password'), 'XU9cBalmEBp1UP+jEU2w4UUBUuNgBY4U')

WebUI.click(findTestObject('FacebookLogin/Page_Sign Up/i_Very Strong_cr-icon fa fa-check'))

WebUI.click(findTestObject('FacebookLogin/Page_Sign Up/button_Continue'))

WebUI.click(findTestObject('Object Repository/FacebookLogin/Page_Facebook Username/u_Click here'))

WebUI.switchToWindowTitle('Facebook Username')

WebUI.setText(findTestObject('FacebookLogin/Page_Facebook Username/input_Click here_fb_username'), 'https://www.facebook.com/jiten.makhija.125#_')

WebUI.click(findTestObject('Object Repository/FacebookLogin/Page_Facebook Username/button_Submit'))

WebUI.waitForElementClickable(findTestObject('FacebookLogin/Page_Facebook Username/u_Click here_1'), 5)

WebUI.waitForElementNotPresent(findTestObject('Experience/Page_Edit Profile/loader'), 5)

//code = WebUI.getText(findTestObject('ReaquireObjects/codeObject'))
WebUI.click(findTestObject('Object Repository/FacebookLogin/Page_Facebook Username/u_Click here_1'))

WebUI.click(findTestObject('Object Repository/FacebookLogin/Page_Facebook Username/a_Finish'))

WebUI.waitForElementVisible(findTestObject('FacebookLogin/Page_Home/div_Application Guide'), 5)

WebUI.click(findTestObject('Object Repository/FacebookLogin/Page_Home/div_Application Guide'))

WebUI.click(findTestObject('Object Repository/FacebookLogin/Page_Home/button_Skip'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Rate/Page_Home/input_View all_searchText'), 2)

WebUI.setText(findTestObject('Object Repository/Rate/Page_Home/input_View all_searchText'), UserToSearch)

WebUI.waitForElementPresent(findTestObject('Rate/Page_Home/Search user button'), 3)

WebUI.click(findTestObject('Search user/Search user button'))

WebUI.click(findTestObject('claim/Page_Search/div_dd1571555909290'))

WebUI.click(findTestObject('Object Repository/claim/Page_View Profile/button_Claim'))

WebUI.click(findTestObject('Object Repository/claim/Page_Edit Profile/span'))

WebUI.click(findTestObject('Object Repository/claim/Page_Edit Profile/button_Save'))

WebUI.click(findTestObject('Object Repository/claim/Page_Edit Profile/a_OK'))

WebUI.click(findTestObject('Object Repository/claim/Page_Edit Profile/i_No connection requests available_fa fa-bell'))

code = WebUI.getText(findTestObject('Object Repository/claim/Page_Edit Profile/b_jhm68x'))

WebUI.closeBrowser()

