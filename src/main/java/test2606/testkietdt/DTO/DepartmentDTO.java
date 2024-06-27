package test2606.testkietdt.DTO;

import lombok.Data;

@Data
public class DepartmentDTO {
    private Long department_id;
    private String name;
    private CompanyDTO company;
}
