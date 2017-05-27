package xyz.monkeytong.hongbao.com.test.liubaiyu;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Cooper on 2017/5/19 0019.
 */

@Aspect

public class AspectTest {

    private static final String TAG = "tagliubaiyu";
    @Pointcut("execution(* xyz.monkeytong.hongbao.activities.SettingsActivity.*(..))")
    public void test(){}
    @Before("test()")
    public void testLog(JoinPoint joinPoint){
        Log.d(TAG, joinPoint.toShortString());
    }
}
