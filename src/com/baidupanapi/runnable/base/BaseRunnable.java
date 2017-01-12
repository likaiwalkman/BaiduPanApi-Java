package com.baidupanapi.runnable.base;

import java.util.List;

public abstract class BaseRunnable {
    public abstract List<Object> execute(Object... paramList) throws Exception;
}
