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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.thework.life/')

WebUI.setText(findTestObject('Object Repository/VerifiedUserRatingUnverified/Page_theworklife - Find Great People To Work With/input_Forgot password_username'), 
    'vijayvstest01@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/VerifiedUserRatingUnverified/Page_theworklife - Find Great People To Work With/input_Forgot password_password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/VerifiedUserRatingUnverified/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.setText(findTestObject('Object Repository/VerifiedUserRatingUnverified/Page_Home/input_View all_searchText'), 'User User')

WebUI.click(findTestObject('Object Repository/VerifiedUserRatingUnverified/Page_Home/button_No search results_btnSearch'))

WebUI.click(findTestObject('Object Repository/VerifiedUserRatingUnverified/Page_Search/div_user user'))

WebUI.click(findTestObject('Object Repository/VerifiedUserRatingUnverified/Page_View Profile/button_Rate Now'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Object Repository/VerifiedUserRatingUnverified/Page_View Profile/p_This is an unverified user Please input Facebook or LinkedIn Profile Link for user user'), 
    'This is an unverified user. Please input Facebook or LinkedIn Profile Link for user user.')

WebUI.click(findTestObject('Object Repository/VerifiedUserRatingUnverified/Page_View Profile/button_Cancel'))

WebUI.closeBrowser()

