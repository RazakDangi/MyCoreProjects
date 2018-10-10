package com.rd.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.rd.util.RunnerClassEnum;

public class WrapperRunner
{
    public static Map<String, List<String>> serviceGroupMap = new Hashtable<String, List<String>>();

    /**
     * @param args
     * @throws InterruptedException 
     */
    public static void main( String[] args ) throws InterruptedException
    {
        Properties prop = new Properties();
        InputStream input = null;
        String thread1 = null;
        String thread2 = null;
        try
        {
            input = new FileInputStream( "src/test.properties" );
            // load a properties file
            prop.load( input );
            for( Map.Entry<Object, Object> entry : prop.entrySet() )
            {
                List<String> categoryList = serviceGroupMap.get( (String) entry.getKey() );
                if( categoryList == null )
                {
                    categoryList = new ArrayList<String>();
                    serviceGroupMap.put( (String) entry.getKey(),
                                         categoryList );
                }
                categoryList.add( (String) entry.getValue() );
            }
            // get the property value and print it out
            thread1 = prop.getProperty( "java1" );
            thread2 = prop.getProperty( "java2" );

        }
        catch( IOException ex )
        {
            ex.printStackTrace();
        }
        finally
        {
            if( input != null )
            {
                try
                {
                    input.close();
                }
                catch( IOException e )
                {
                    e.printStackTrace();
                }
            }
        }

        ExecutorService executor = Executors.newFixedThreadPool( serviceGroupMap.size() );

        for( List<String> services : serviceGroupMap.values() )
        {
            for( String service : services )
            {
                Runnable runnable = createRuunableObjects( service );
                executor.execute( runnable );
            }
        }
        executor.shutdown();

    }

    private static Runnable createRuunableObjects( String service )
    {

        String[] services = service.split( "," );
        List<RunnerClassEnum> runnerList = new ArrayList<>();
        for( String ser : services )
        {
            for( RunnerClassEnum claz : RunnerClassEnum.values() )
            {
                if( claz.getServiceName().equals( ser ) )
                {
                    runnerList.add( claz );
                }
            }
        }
        System.out.println( "created a runnble for " + service );
        return new ThreadGroupRunner( runnerList );

    }
}
