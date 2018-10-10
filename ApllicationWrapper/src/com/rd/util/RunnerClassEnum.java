package com.rd.util;

/**
 * Enum values containing name of each application runner class. 
 * @author Razak.Dangi
 *
 */
public enum RunnerClassEnum
{
    SECURITYSERVICE("SecurityService", "default", "com.rd.one.Test1"),
    BATCHSERVICE("BatchService", "default", "com.rd.two.Test2"),
    MASTERDATESERVICE("MasterDataService", "default", "com.rd.three.Test3"),
    ENTERPRISEDATASERVICE("EnterpriseDataService", "default", "com.rd.four.Test4");

    private String serviceName;
    private String instance;
    private String fullQClassName;

    private RunnerClassEnum( String serviceName,
        String instance,
        String fullQClassName )
    {
        this.serviceName = serviceName;
        this.instance = instance;
        this.fullQClassName = fullQClassName;
    }

    public String getFullQClassName()
    {
        return fullQClassName;
    }

    public String getServiceName()
    {
        return serviceName;
    }

    public String getInstance()
    {
        return instance;
    }

}
