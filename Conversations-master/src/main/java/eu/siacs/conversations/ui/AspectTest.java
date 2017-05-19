package eu.siacs.conversations.ui;

/**
 * Created by Cooper on 2017/5/18 0018.
 */
@Aspect

public class AspectTest {

    private static final String TAG = "xuyisheng";

    @Before("execution(* ChangePasswordActivity.onStart(..))")

    public void onActivityMethodBefore(JoinPoint joinPoint) throws Throwable {

        String key = joinPoint.getSignature().toString();

        Log.d(TAG, "onActivityMethodBefore: " + key);

    }

}
