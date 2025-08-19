package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/BDD_Practice/src/test/java/Login_Feature/Login.feature",
				glue = "Login_Step_Def",
				tags = "@login",
				plugin = {"html:"}
							)
public class MyRunner {

}
