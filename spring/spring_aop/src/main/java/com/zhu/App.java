package com.zhu;

import com.zhu.statics.target.AgencyProxy;
import com.zhu.statics.target.RentHouse;
import com.zhu.statics.target.You;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RentHouse target = new You();
        AgencyProxy proxy = new AgencyProxy(target);
        proxy.toRendHouse();


    }
}
