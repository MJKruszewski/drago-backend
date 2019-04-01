package pl.sunflux.drago.domain.familiar;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import pl.sunflux.drago.domain.familiar.event.CreateEvent;

@Component
public final class DragonEventListener {

    @EventListener
    public void onCreate(CreateEvent createEvent) {

    }
}
