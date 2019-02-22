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

WebUI.setText(findTestObject('Object Repository/zhuji1/Page_VisionStack/input__username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/zhuji1/Page_VisionStack/input__password'), 'MjBx0EvJu5YFFplPJZ1HyA==')

WebUI.click(findTestObject('Object Repository/zhuji1/Page_VisionStack/button_'))

WebUI.click(findTestObject('Object Repository/zhuji1/Page_VisionStack/div_'))

WebUI.click(findTestObject('Object Repository/zhuji1/Page_VisionStack/div__1'))

WebUI.click(findTestObject('Object Repository/zhuji1/Page_VisionStack/li_'))

WebUI.click(findTestObject('Object Repository/zhuji1/Page_VisionStack/button__1'))

WebUI.setText(findTestObject('Object Repository/zhuji1/Page_VisionStack/input__el-input__inner'), '789')

WebUI.setText(findTestObject('Object Repository/zhuji1/Page_VisionStack/input__el-input__inner_1'), mima)

WebUI.waitForAlert(3)

WebUI.click(findTestObject('Object Repository/zhuji1/Page_VisionStack/i__el-select__caret el-input__'))

WebUI.waitForAlert(3)

WebUI.click(findTestObject('Object Repository/zhuji1/Page_VisionStack/li_560'))

WebUI.waitForAlert(3)

WebUI.click(findTestObject('Object Repository/zhuji1/Page_VisionStack/i__el-select__caret el-input___1'))

WebUI.waitForAlert(3)

WebUI.click(findTestObject('Object Repository/zhuji1/Page_VisionStack/li__1'))

WebUI.waitForAlert(3)

WebUI.click(findTestObject('Object Repository/zhuji1/Page_VisionStack/button__2'))

