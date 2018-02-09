package jackson;

import com.oracle.jrockit.jfr.EventDefinition;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UpdateEvent {

    private EventDefinition eventDefinition;

    public void UpdateOfferDefinitionData(EventDefinition eventDefinition) {
        this.eventDefinition = eventDefinition;
    }
}