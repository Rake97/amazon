package org.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonShopping {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rake9\\eclipse-workspace\\Amazon\\driver\\chromedriver.exe");
		WebDriver a=new ChromeDriver();
		a.get("https://www.google.com/search?q=amazon&sxsrf=APq-WBsW5zyCRo2yMEWVZflzkH4JPIuhlA%3A1643993637420&ei=JVr9Ydz8GKeZ4-EPjZW4iAQ&ved=0ahUKEwico5XGweb1AhWnzDgGHY0KDkEQ4dUDCA8&uact=5&oq=amazon&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECcyEAguELEDEIMBEMcBENEDEEMyBwgAELEDEEMyBwgAELEDEEMyBwgAELEDEEMyBwgAELEDEEMyCggAELEDEIMBEEMyBwgAELEDEEMyBAgAEEMyCwgAEIAEELEDEIMBOgcIIxDqAhAnOgUILhCABDoICAAQgAQQsQM6CAguELEDEIMBOgsILhCABBCxAxCDAUoECEEYAEoECEYYAFAAWOwVYPYZaAFwAHgAgAH4AYgBwAeSAQUxLjMuMpgBAKABAbABCsABAQ&sclient=gws-wiz");
		WebElement b = a.findElement(By.xpath("//div[contains(@class,'CCgQ5')]"));
		b.click();
		WebElement c = a.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		c.click();
		WebElement d = a.findElement(By.xpath("//input[@type='email']"));
		d.sendKeys("8148050181");
		WebElement e = a.findElement(By.xpath("//input[@id='continue']"));
		e.click();
		WebElement f = a.findElement(By.xpath("//input[@type='password']"));
		f.sendKeys("pcrkpcrk");
		WebElement g = a.findElement(By.xpath("//span[@id='auth-signin-button']"));
		g.click();
		Thread.sleep(3000);
		WebElement h = a.findElement(By.xpath("//input[@type='text']"));
		h.click();
		h.sendKeys("realme");
		Thread.sleep(3000);
		WebElement i = a.findElement(By.xpath("(//div[@class='s-suggestion'])[8]"));
		i.click();
		WebElement j = a.findElement(By.xpath("(//h2[contains(@class,'spacing')])[2]"));
		j.click();
		WebElement k = a.findElement(By.xpath("//input[@id='buy-now-button']"));
		k.click();
		
	}

}
