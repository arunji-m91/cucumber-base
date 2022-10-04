package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(stepNotifications=true,dryRun=false,plugin= {"usage","json:target/Output json.xml"},monochrome=true,features="src\\test\\resources\\features",glue="step.definition")
public class AdactinLoginTest {
	
	
	
	
	


}
/*
 * Cucumber options
 * 1 features =give location of feature file it generate all scenario snippet
 * give the feature file location if you have multiple folder give that folder name
 * and generate snippet
 * 
 * 2 glue 
 *for use the snippet method,we create seperate pacakage and 
 *create class write the method like that we give the 
 * 
 * 3 name 
 * if we mention name="give exact scenario from feature file" it generate snippet 
 * for that scenario only(it contains step)
 * we mention two or more scenario like 
 * name={"one scenario","another scenario"}  
 * if both the scenario is same both will execute and generate the 
 * snippet for each scenario (asked in interview)
 * 
 * 4 monochrome 
 * while generate snippet in console some content print in not understandable
 * form so we declare monochrome=true then run it shows in readable format
 * (by default monochrome is false)
 * by using plugin we convert  this monochrome language into some various form
 *
 * 5 plugin
 *by using plugin first  monochrome convert text into various format by using 
 *pretty,usage,html,json,junit,(xml),rerun
 *pretty -->  is convert into normal plain text
 *plugin=("usage") -->give output as -->[{ ......}] this structure
 *plugin={"usage","html:target/filename.html"} .html here is extension of file
 *
 *6 json 
 *similarly we can generate json report
 *plugin={"usage","html:target/filename.json"}  .json extension
 *
 *7 junit xml
 *similarly we generate junit xml reoort also
 *plugin{"usage","junit:target/filename.xml"}
 *
 * 8 dryRun 
 * let assume you have 100 scenarios if we execute the scenarios, the 100 th line snippet
 * is not matched after executing only you find have to correct and rerun from first which consume time
 * so before  execution you first check the snippet matching by using dryRun like
 * dryRun=true -->it not execute program just match the snippet if anyone snippet is
 * not matched it shows that not matching method after you correct then execute 
 * we avoid time wasting
 * 
 * 9 snippest
 * by using this we can convert all snippet method into CAMELCASE or some other 
 * snippest=SnippetType.CAMELCASE
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

