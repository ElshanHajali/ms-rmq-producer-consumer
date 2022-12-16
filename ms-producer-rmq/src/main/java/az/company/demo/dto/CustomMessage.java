package az.company.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomMessage implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String message;
    private String sendAt;
}
