package xyz.monkeytong.hongbao.com.test.liubaiyu;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by Cooper on 2017/5/19 0019.
 */

@Aspect

public class AspectTest {

    private static final String TAG = "tag2test";
    public void TestAop()
    {
        Log.d("test","Aop");
    }
    @Before("execution(* activities.SettingsActivity.TestAop(..))")

    public void onActivityMethodBefore(JoinPoint joinPoint) throws Throwable {

        String key = joinPoint.getSignature().toString();

        Log.d(TAG, "onActivityMethodBefore: " + key);

    }

}
