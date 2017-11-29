package moe.hugh.fitbitdndnotificationfix;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam;
import static de.robv.android.xposed.XposedHelpers.findAndHookMethod;

public class FitbitDNDNotificationFix implements IXposedHookLoadPackage {
    public void handleLoadPackage(final LoadPackageParam lpparam) throws Throwable {
        if (!lpparam.packageName.equals("com.fitbit.FitbitMobile")) {
            return;
        }
        findAndHookMethod("android.service.notification.NotificationListenerService.Ranking", lpparam.classLoader, "isAmbient", XC_MethodReplacement.returnConstant(false));
        findAndHookMethod("android.service.notification.NotificationListenerService.Ranking", lpparam.classLoader, "matchesInterruptionFilter", XC_MethodReplacement.returnConstant(true));
    }
}
