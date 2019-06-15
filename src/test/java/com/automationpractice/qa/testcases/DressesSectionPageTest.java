package com.automationpractice.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automationpractice.qa.base.TestBase;
import com.automationpractice.qa.pages.DressesSectionPage;
import com.automationpractice.qa.pages.HomePage;

public class DressesSectionPageTest extends TestBase{
	
	DressesSectionPage dressesSectionPage;
	TestBase testbase;
	HomePage home;


	public DressesSectionPageTest() throws IOException {
		super();
		
	}
		
	@BeforeTest
	public void setUp() throws IOException{
		
		initialisation();
		dressesSectionPage = new DressesSectionPage();
		testbase = new TestBase();	
		home = new HomePage();
		home.navitageDressLink();
	}
	
	@Test
	public void Validate_dress_size_small_Test() throws IOException{
		Assert.assertTrue(dressesSectionPage.Validate_dress_size_small().isDisplayed());
	}
	
	@Test
    public void Validate_dress_size_Medium_Test() throws IOException{
		Assert.assertTrue(dressesSectionPage.Validate_dress_size_Medium().isDisplayed());
	}
	
	@Test
    public void validate_dress_size_Large_Test() throws IOException{
		Assert.assertTrue(dressesSectionPage.Validate_dress_size_Large().isDisplayed());
	}
	
	@Test
	public void verifyheaderCounter(){
		Assert.assertEquals(dressesSectionPage.getCoutFromHeader(), dressesSectionPage.getListOfProductDisplayed());
	}
	
	@Test
	public void ValidateProductAddedToCart(){
		dressesSectionPage.product_added_to_cart();
		String msg=dressesSectionPage.cartAddedSucess();
		Assert.assertTrue(msg.contains("Product"));	
	}

}
