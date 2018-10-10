package com.rd.two;

public class Test2
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        if( args.length < 2 )
        {
            System.out.println( "please provide service and instance name" );
            System.exit( 0 );
        }

        System.out.println( "Service " + args[0] + " Instance Name " + args[1] );

    }

}
