package concurrent.chapter11;

/**
 * 上下文对象(使用单例队形的ThreadLocal)
 */
public final class ActionContext {

    private static final ThreadLocal<Context> threadLocal = ThreadLocal.withInitial(() -> new Context());

    private static class ContextHolder {
        private final static ActionContext actionContext = new ActionContext();
    }

    public static ActionContext getActionContext() {
        return ContextHolder.actionContext;
    }

    public Context getContext() {
        return threadLocal.get();
    }

    private ActionContext(){

    }
}