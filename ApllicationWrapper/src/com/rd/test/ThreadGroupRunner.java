package com.rd.test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import com.rd.util.RunnerClassEnum;

public class ThreadGroupRunner implements Runnable
{

    private List<RunnerClassEnum> classList = new ArrayList<>();

    public ThreadGroupRunner( List<RunnerClassEnum> runnerList )
    {
        for( RunnerClassEnum classEnum : runnerList )
        {
            classList.add( classEnum );
        }
    }

    @Override
    public void run()
    {
        for( RunnerClassEnum classEnum : classList )
        {
            try
            {
                final Class<?> clazz = Class.forName( classEnum.getFullQClassName() );
                final Method method = clazz.getMethod( "main",
                                                       String[].class );

                Object[] args = new Object[1];
                args[0] = new String[] { classEnum.getServiceName(), classEnum.getInstance() };

                method.invoke( null,
                               args );
            }
            catch( final Exception e )
            {
                e.printStackTrace();
            }
        }
    }

}
