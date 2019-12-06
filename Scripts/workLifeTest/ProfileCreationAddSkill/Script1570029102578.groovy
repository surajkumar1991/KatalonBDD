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

String skill = 'SkillInput' + System.currentTimeMillis()

WebUI.openBrowser(GlobalVariable.ProdAppUrl)

WebUI.navigateToUrl('https://www.thework.life/')

WebUI.setText(findTestObject('Object Repository/SkillPageObject/Page_theworklife - Find Great People To Work With/input_Forgot password_username'), 
    'worklifetest10001@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/SkillPageObject/Page_theworklife - Find Great People To Work With/input_Forgot password_password'), 
    'XU9cBalmEBp1UP+jEU2w4UUBUuNgBY4U')

WebUI.click(findTestObject('Object Repository/SkillPageObject/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.click(findTestObject('Object Repository/SkillPageObject/Page_Home/a_profile'))

WebUI.click(findTestObject('Object Repository/SkillPageObject/Page_Home/a_Edit Profile'))

WebUI.click(findTestObject('Object Repository/SkillPageObject/Page_Edit Profile/a_Skills'))

WebUI.click(findTestObject('Object Repository/SkillPageObject/Page_Edit Profile/input_Add Skills_skills_name'))

WebUI.clearText(findTestObject('Object Repository/SkillPageObject/Page_Edit Profile/input_Add Skills_skills_name'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/SkillPageObject/Page_Edit Profile/input_Add Skills_skills_name'), skill.toString())

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/SkillPageObject/Page_Edit Profile/div_Add Skills                                                                                    Add Skill'))

WebUI.click(findTestObject('Object Repository/SkillPageObject/Page_Edit Profile/button_Add Skill'))

println(skill)

WebUI.verifyElementPresent(findTestObject('SkillPageObject/Page_Edit Profile/li_test123450', [('text') : skill]), 0)

