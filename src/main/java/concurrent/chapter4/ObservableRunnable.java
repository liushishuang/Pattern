package concurrent.chapter4;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 观察者
 */
public abstract class ObservableRunnable implements Runnable {
    //监听的对象接口
    final protected LifeCycleListener listener;

    public ObservableRunnable(final LifeCycleListener listener) {
        this.listener = listener;
    }
    //将事件通知给Listener
    protected void notifyChange(final RunnableEvent event) {
        listener.onEvent(event);
    }

    /**
     * 枚举的状态
     */
    public enum RunnableState {
        RUNNING, ERROR, DONE
    }
    @Data
    @AllArgsConstructor
    public static class RunnableEvent {
        private final RunnableState state;
        private final Thread thread;
        private final Throwable cause;

    }
}
