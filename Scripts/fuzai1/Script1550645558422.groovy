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

WebUI.navigateToUrl('http://192.168.6.64/#/')

WebUI.setText(findTestObject('fuzai1/Page_VisionStack/input__username'), 'admin')

WebUI.setEncryptedText(findTestObject('fuzai1/Page_VisionStack/input__password'), 'MjBx0EvJu5YFFplPJZ1HyA==')

WebUI.click(findTestObject('fuzai1/Page_VisionStack/button_ - Copy'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('fuzai1/Page_VisionStack/div_'))

WebUI.waitForAlert(3)

WebUI.click(findTestObject('fuzai1/Page_VisionStack/li_'))

WebUI.click(findTestObject('fuzai1/Page_VisionStack/button_'))

WebUI.setText(findTestObject('fuzai1/Page_VisionStack/input__el-input__inner'), test)

WebUI.click(findTestObject('fuzai1/Page_VisionStack/i__el-select__caret el-input__'))

WebUI.waitForAlert(3)

WebUI.click(findTestObject('fuzai1/Page_VisionStack/li_590'))

WebUI.click(findTestObject('fuzai1/Page_VisionStack/i__el-select__caret el-input___1'))

WebUI.waitForAlert(3)

WebUI.click(findTestObject('fuzai1/Page_VisionStack/li__1'))

WebUI.click(findTestObject('fuzai1/Page_VisionStack/button__1'))

WebUI.verifyElementPresent(findTestObject('fuzai1/Page_VisionStack/input__el-input__inner'), 0)

WebUI.waitForAlert(5)

WebUI.closeBrowser()

