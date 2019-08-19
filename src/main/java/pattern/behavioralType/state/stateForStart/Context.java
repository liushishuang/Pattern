package pattern.behavioralType.state.stateForStart;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 15:05 2018-7-25
 * 维护了状态实例,为当前状态
 */
@Data
@AllArgsConstructor
public class Context {
    private State state;


    //当前状态下做事
    public void request() {
        state.doAction(this);
    }
}
