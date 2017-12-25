package com.lws.fragment.demo.config;

import timber.log.Timber;

/**
 * Created by lws on 2017/12/25.
 */

public class ThreadAwareDebugTree extends Timber.DebugTree {
    @Override
    protected String createStackElementTag(StackTraceElement element) {
        return super.createStackElementTag(element) + "(Line " + element.getLineNumber() + ")"; //日志显示行号
    }

    @Override
    protected void log(int priority, String tag, String message, Throwable t) {
        if (tag != null) {
            String threadName = Thread.currentThread().getName();
            tag = "<" + threadName + ">" + tag;
        }
        super.log(priority, tag, message, t);
    }
}
