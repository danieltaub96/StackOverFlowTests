package mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

/**
 * @author danieltaub on 22/01/2018.
 */
@Mapper(config = CentralConfig.class)
public interface DogMapper {
    DogMapper mapper = Mappers.getMapper( DogMapper.class );

    @Mapping(source = "say", target = "say")
    Cat convert(Dog dog);
}
