package com.microsoft.applicationinsights.agent3.internal.agent.utils;

import org.glowroot.engine.impl.TimerNameImpl;
import org.glowroot.instrumentation.api.TimerName;

public class TimerUtil {
    private TimerUtil(){}

    public static String getTimerName(TimerName tn) {
        return ((TimerNameImpl) tn).name();
    }
}
