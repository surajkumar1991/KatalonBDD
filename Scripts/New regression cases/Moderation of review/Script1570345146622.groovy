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

WebUI.setText(findTestObject('Object Repository/moderate1/Page_theworklife - Find Great People To Work With/input_Forgot password_username'), 
    'twl.moderator2@thework.life')

WebUI.setEncryptedText(findTestObject('Object Repository/moderate1/Page_theworklife - Find Great People To Work With/input_Forgot password_password'), 
    '8PaKxJY1Q9KyHtQHchZ+/brhRmpikEMj')

WebUI.click(findTestObject('Object Repository/moderate1/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.click(findTestObject('Object Repository/moderate1/Page_Home/a_pending actions'))

WebUI.click(findTestObject('Object Repository/moderate1/Page_Pending Actions/button_Moderate'))

WebUI.click(findTestObject('Object Repository/moderate1/Page_Pending Actions/button_Keep It'))

WebUI.setText(findTestObject('Object Repository/moderate1/Page_Pending Actions/textarea_i donr fblkfllskhgkhsgkhgksg_txtRemark'), 
    'kgfjajkfsgjkflcbjksgfjsbvklbsjgjsbjbsjkgbvsjkbvjksbvjkbkjbvjksbvjkbsjkbvjskbvksbvksbvkbj')

WebUI.click(findTestObject('Object Repository/moderate1/Page_Pending Actions/button_Keep It'))

WebUI.closeBrowser()

