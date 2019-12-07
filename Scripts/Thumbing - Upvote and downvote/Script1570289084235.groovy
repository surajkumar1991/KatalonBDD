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

WebUI.openBrowser(GlobalVariable.ProdAppUrl)

WebUI.navigateToUrl('https://qa.thework.life/')

WebUI.setText(findTestObject('Object Repository/Thumbing-Upvote and Downvote/Page_theworklife - Find Great People To Work With/input_Please enter username or email_username'), 
    'worklifetest10001@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Thumbing-Upvote and Downvote/Page_theworklife - Find Great People To Work With/input_Forgot password_password'), 
    'XU9cBalmEBp1UP+jEU2w4UUBUuNgBY4U')

WebUI.click(findTestObject('Object Repository/Thumbing-Upvote and Downvote/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.setText(findTestObject('Object Repository/Thumbing-Upvote and Downvote/Page_Home/input_View all_searchText'), 'vijay test')

WebUI.click(findTestObject('Search user/Search user button'))

WebUI.waitForElementClickable(findTestObject('Thumbing-Upvote and Downvote/Page_Home/span_vijaytest'), 3)

WebUI.delay(5)

WebUI.click(findTestObject('Thumbing-Upvote and Downvote/Page_Home/span_vijaytest'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Thumbing-Upvote and Downvote/Page_View Profile/span_Agree'), 5)

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

