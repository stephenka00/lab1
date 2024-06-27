package test2606.testkietdt.DTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDTO {
    private Long user_id;
    private String user_name;
    private String firstname;
    private String lastname;
    private String address;
    private String createdBy;
    private LocalDateTime createdTime;
    private String updatedBy;
    private LocalDateTime updatedTime;
    private DepartmentDTO department;
}
