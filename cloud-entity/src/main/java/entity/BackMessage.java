package entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @date  2020/12/6 16:50
 * @author  by zjd
 */
@Data
@AllArgsConstructor
public class BackMessage<T> {

    private Integer code;
    private String message;
    private  T data;

    public BackMessage(String message,T data) {
        this.message=message;
        this.data=data;
    }
}
