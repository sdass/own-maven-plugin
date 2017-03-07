package sample.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * Says "Hi" to the user. Takes no parameter
 *
 .m2/settings.xml add <pluginGroup>org.subra.own.plugins</pluginGroup> under plugingroup to shorten the names on command
 Execute after mvn install ::>> mvn own:sayhello -Dsayhello.greeting="Flying Dutch Eagle"
 */

@Mojo( name = "sayhello")

public class GreetingMojo extends AbstractMojo
{

	@Parameter(property = "sayhello.greeting", defaultValue = "My Hello World!")
	private String greeting;





    public void execute() throws MojoExecutionException
    {
        //getLog().info( "Hello, world." );
        getLog().info( greeting );
    }
}
