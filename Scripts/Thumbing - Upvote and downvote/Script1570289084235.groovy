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

WebUI.openBrowser(GlobalVariable.AppUrl)

WebUI.navigateToUrl(GlobalVariable.AppUrl)

WebUI.setText(findTestObject('Object Repository/Thumbing-Upvote and Downvote/Page_theworklife - Find Great People To Work With/input_Please enter username or email_username'), 
    'vijayvstest01@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Thumbing-Upvote and Downvote/Page_theworklife - Find Great People To Work With/input_Forgot password_password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Thumbing-Upvote and Downvote/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.setText(findTestObject('Object Repository/Thumbing-Upvote and Downvote/Page_Home/input_View all_searchText'), 'suraj')

WebUI.click(findTestObject('Search user/Search user button'))

WebUI.waitForElementClickable(findTestObject('Thumbing-Upvote and Downvote/Page_Home/span_Suraj1569758600295makhija'), 3)

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/Thumbing-Upvote and Downvote/Page_Home/span_Suraj1569758600295makhija'))

WebUI.waitForElementClickable(findTestObject('Thumbing-Upvote and Downvote/Page_View Profile/span_Agree'), 0)

WebUI.click(findTestObject('Object Repository/Thumbing-Upvote and Downvote/Page_View Profile/span_Agree'))

WebUI.waitForElementNotPresent(findTestObject('Experience/Page_Edit Profile/loader'), 2)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Thumbing-Upvote and Downvote/Page_View Profile/span_Agree'))

WebUI.waitForElementClickable(findTestObject('Thumbing-Upvote and Downvote/Page_View Profile/span_Disagree'), 3)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Thumbing-Upvote and Downvote/Page_View Profile/span_Disagree'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Thumbing-Upvote and Downvote/Page_View Profile/span_Disagree'))

WebUI.closeBrowser()

