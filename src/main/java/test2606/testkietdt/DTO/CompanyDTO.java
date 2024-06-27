package test2606.testkietdt.DTO;

import lombok.Data;

@Data
public class CompanyDTO {
    private Long company_id;
    private String company_name;
    private CoporationDTO coporation;
}
