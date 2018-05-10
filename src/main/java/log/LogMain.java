package log;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.PackagePrivate;

/**
 * @author danieltaub on 09/04/2018.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LogMain {
    private int daniel;
    private String clazz;

}
