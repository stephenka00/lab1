package test2606.testkietdt.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import test2606.testkietdt.DTO.UserDTO;
import test2606.testkietdt.Entity.User;


@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source =
    "department.company.corporation",target = "department.company.corporation")
    UserDTO toUserDTO(User user);
}
