package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Search {
	@Given("User tap menu beranda")
	public void user_tap_menu_beranda() {
		Mobile.tap(findTestObject('Search_Category/button_Beranda'), 0)
	}

	@Then("User tap search semua category")
	public void user_tap_search_semua_category() {
		Mobile.tap(findTestObject('Search_Category/button_Semua'), 0)
	}

	@Then("User verify image at search semua mantul kursi")
	public void user_verify_image_at_search_semua_mantul_kursi() {
		Mobile.verifyElementVisible(findTestObject('Search_Category/img_mantul_kursi'), 0)
	}

	@Then("User tap search elektronik category")
	public void user_tap_search_elektronik_category() {
		Mobile.tap(findTestObject('Search_Category/button_Elektronik'), 0)
	}

	@Then("User verify image at search elektronik tango")
	public void user_verify_image_at_search_elektronik_tango() {
		Mobile.verifyElementVisible(findTestObject('Search_Category/img_tango'), 0)
	}
}