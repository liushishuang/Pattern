package concurrent.chapter12;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BalkingData {
    private final String fileName;
    private String content;
    private boolean changed;

    public BalkingData(String fileName, String content) {
        this.fileName = fileName;
        this.content = content;
        this.changed = true;
    }

    //发生变化后, 主动通知- 主动通知最近的
    public synchronized void change(String newContent) {
        this.content = newContent;
        this.changed = true;
    }

    //定期执行--轮值服务生
    public synchronized void save() throws IOException {
        if (!changed)
            return;
        doSave();
        this.changed = false;
    }

    private void doSave() throws IOException {
        System.out.println(Thread.currentThread().getName() + " calls do save,content=" + content);
        try (Writer writer = new FileWriter(fileName, true)) {
            writer.write(content);
            writer.write("\n");
            writer.flush();
        }
    }
}