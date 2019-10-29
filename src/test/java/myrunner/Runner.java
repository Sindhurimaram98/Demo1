package myrunner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\s.maram\\Downloads\\cuc\\features\\DemoWebShop.feature",glue= {"step_def"},tags= {"@parameterdemo"})


public class Runner {

}
