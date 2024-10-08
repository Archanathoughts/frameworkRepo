package pack1;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createContactTest()
	{
		System.out.println("createContactTest");
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser","chrome");
		String UNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(UNAME);
		System.out.println(PASSWORD);
	}
	
	@Test
	public void createContactwithPhoneTest()
	{
		
		System.out.println("createContactTestwithPhone");
	}
}
/**
 * test suite execution via pom.xml
 *  <build>
  <plugins>
         <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>3.5.0</version>
        <configuration>
          <suiteXmlFiles>
            <suiteXmlFile>testngSurefirePlugin.xml</suiteXmlFile>
             <suiteXmlFile>testng.xml</suiteXmlFile>
          </suiteXmlFiles>
        </configuration>
      </plugin>
      
        
    </plugins>
  </build>
  **/
