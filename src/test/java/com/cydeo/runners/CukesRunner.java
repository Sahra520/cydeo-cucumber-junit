package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={
              //"pretty",//basically it just prints out additional information about the scenario that is being executed
                "html:target/cucumber_reports.html",
                  "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"//this plugin generates the "MAVEN CUCUMBER REPORTING"
                //"pretty" used to print out additional information about the scenario currently executed
        },
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = false,     //to turn and off our step_def. implementations running or not, so we can easily generate snippet
        //if true:turned on,and will not execute the actual code(java-selenium-junit)
        //if false: turned off,and will execute the actual code (java-selenium-junit)
        tags = "" , //"@employee and not @admin"----like this
        publish = true//will enable a functionality from cucumber to generate a public link for the report of our final execution of our code
        //publish = false
        //the link will be automatically generated and printed in the console
        //it will be ready to share with anyone
        //and
        //or
        //and not


        //mvn test -Dcucumber.filter.tags=@femaleScientists ---> for run anything we can use  --  it comes from cucumber reference
        //why do we need this? to be able to run our code from outside our IDE,possibly from Jenkins or from Command line
)
public class CukesRunner {


}
//https://cucumber.io/docs/guides/parallel-execution/?sbsearch=Parallel+Execution+&lang=java
//search from Chrome
//look downloads