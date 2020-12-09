package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @date  2020/12/6 16:50
 * @author  by zjd
 */
@Data
@NoArgsConstructor
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
