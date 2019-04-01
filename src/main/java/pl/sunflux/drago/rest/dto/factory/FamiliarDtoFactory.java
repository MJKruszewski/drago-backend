package pl.sunflux.drago.rest.dto.factory;

import org.mapstruct.Mapper;
import pl.sunflux.drago.domain.familiar.entity.Dragon;
import pl.sunflux.drago.rest.dto.familiar.DragonDto;

@Mapper(uses = {Dragon.class})
public interface FamiliarDtoFactory {

    public DragonDto dragonToDragonDto(Dragon dragon);

    public Dragon dragonDtoToDragon(DragonDto dragon);

}
