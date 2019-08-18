package concurrent.chapter15;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Thread-Per-Message Design Pattern
 * 每个请求都有一个线程处理
 */
@Data
@AllArgsConstructor
public class Message {
    private final String value;
}