package com.simplebdd.CucumberConcept;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Helpers {
	WebDriver driver = null;
	public Helpers(WebDriver driver) {
		super();
		this.driver = driver;
	}
	/**
	 * method returns the text of the web elements found by css selector provided
	 * @param cssSelector
	 * @return
	 */
	public List<String> getTextByCSS(String cssSelector) {
		List<WebElement> listWebElements = driver.findElements(By.cssSelector(cssSelector));
		List<String> textWebElements = new ArrayList<String>();
		for (WebElement webElement : listWebElements){
			textWebElements.add(webElement.getText());
		}
		return textWebElements;
	}
	/**
	 * method prints out to commend line provided List<String>
	 * @param listOfTextElements
	 */
	public void printOutList(List<String> listOfTextElements){
		for (String textElement : listOfTextElements){
			System.out.println(textElement);
		}
	}
	/**
	 * method prints List to the file
	 * @param listOfTextElements
	 */
	public void printToFile(List<String> listOfTextElements){
		String filePath = "//Users/tetyanadudka/Documents/testWinTech.txt";
		Writer writer = null;
		try {
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath), "utf-8"));
			for (String livegame : listOfTextElements){
				livegame+=System.getProperty("line.separator");
				writer.write(livegame);
			}
		} catch (IOException e){
			
		}finally {
			if (writer!=null){
				try{
					writer.close();
				} catch (IOException e){
					
				}
			}
			
		}
	}

}
