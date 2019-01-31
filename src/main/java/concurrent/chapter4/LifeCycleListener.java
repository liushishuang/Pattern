package concurrent.chapter4;

/**
 * @author LiuShishuang
 */
public interface LifeCycleListener {
    
    void onEvent(ObservableRunnable.RunnableEvent event);
}
