import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login/TC1_ValidCredential'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('saucedemo.com/Checkout/Button/Button Add to Cart/button_ATC1'))

WebUI.verifyElementPresent(findTestObject('saucedemo.com/Checkout/Shopping Cart Badge/1 item'), 0)

WebUI.click(findTestObject('saucedemo.com/Checkout/Button/Button Add to Cart/button_ATC2'))

WebUI.verifyElementPresent(findTestObject('saucedemo.com/Checkout/Shopping Cart Badge/2 item'), 0)

WebUI.click(findTestObject('saucedemo.com/Checkout/Button/Button Add to Cart/button_ATC3'))

WebUI.verifyElementPresent(findTestObject('saucedemo.com/Checkout/Shopping Cart Badge/3 item'), 0)

WebUI.click(findTestObject('saucedemo.com/Checkout/Button/Button Add to Cart/button_ATC4'))

WebUI.verifyElementPresent(findTestObject('saucedemo.com/Checkout/Shopping Cart Badge/4 item'), 0)

WebUI.click(findTestObject('saucedemo.com/Checkout/Button/Button Add to Cart/button_ATC5'))

WebUI.verifyElementPresent(findTestObject('saucedemo.com/Checkout/Shopping Cart Badge/5 item'), 0)

WebUI.click(findTestObject('saucedemo.com/Checkout/Button/Button Add to Cart/button_ATC6'))

WebUI.verifyElementPresent(findTestObject('saucedemo.com/Checkout/Shopping Cart Badge/6 item'), 0)

WebUI.click(findTestObject('saucedemo.com/Checkout/Shopping Cart Icon'))

WebUI.verifyElementPresent(findTestObject('saucedemo.com/Checkout/Div Your Cart/div_YC1'), 0)

WebUI.verifyElementPresent(findTestObject('saucedemo.com/Checkout/Div Your Cart/div_YC2'), 0)

WebUI.verifyElementPresent(findTestObject('saucedemo.com/Checkout/Div Your Cart/div_YC3'), 0)

WebUI.verifyElementPresent(findTestObject('saucedemo.com/Checkout/Div Your Cart/div_YC4'), 0)

WebUI.verifyElementPresent(findTestObject('saucedemo.com/Checkout/Div Your Cart/div_YC5'), 0)

WebUI.verifyElementPresent(findTestObject('saucedemo.com/Checkout/Div Your Cart/div_YC6'), 0)

WebUI.click(findTestObject('saucedemo.com/Checkout/Button/btn Checkout'))

WebUI.setText(findTestObject('saucedemo.com/Checkout/input Checkout Information_firstName'), 'Muhammad')

WebUI.setText(findTestObject('saucedemo.com/Checkout/input Checkout Information_lastName'), 'Zuhairi')

WebUI.setText(findTestObject('saucedemo.com/Checkout/input Checkout Information_postalCode'), '12720')

WebUI.click(findTestObject('saucedemo.com/Checkout/Button/btn Continue'))

WebUI.verifyElementPresent(findTestObject('saucedemo.com/Checkout/Div Checkout Overview/div_CO1'), 0)

WebUI.verifyElementPresent(findTestObject('saucedemo.com/Checkout/Div Checkout Overview/div_CO2'), 0)

WebUI.verifyElementPresent(findTestObject('saucedemo.com/Checkout/Div Checkout Overview/div_CO3'), 0)

WebUI.verifyElementPresent(findTestObject('saucedemo.com/Checkout/Div Checkout Overview/div_CO4'), 0)

WebUI.verifyElementPresent(findTestObject('saucedemo.com/Checkout/Div Checkout Overview/div_CO5'), 0)

WebUI.verifyElementPresent(findTestObject('saucedemo.com/Checkout/Div Checkout Overview/div_CO6'), 0)

WebUI.verifyElementPresent(findTestObject('saucedemo.com/Checkout/Div Checkout Overview/div Payment Information'), 0)

WebUI.verifyElementPresent(findTestObject('saucedemo.com/Checkout/Div Checkout Overview/div Shipping Information'), 0)

WebUI.verifyElementPresent(findTestObject('saucedemo.com/Checkout/Div Checkout Overview/div Total Price'), 0)

WebUI.click(findTestObject('saucedemo.com/Checkout/Button/btn Finish'))

WebUI.verifyElementPresent(findTestObject('saucedemo.com/Checkout/img Order Success'), 0)

WebUI.click(findTestObject('saucedemo.com/Checkout/Button/btn Back Home'))

WebUI.closeBrowser()

