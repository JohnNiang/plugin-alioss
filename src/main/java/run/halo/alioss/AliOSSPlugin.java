package run.halo.alioss;

import org.pf4j.PluginWrapper;
import org.springframework.stereotype.Component;
import run.halo.app.extension.SchemeManager;
import run.halo.app.plugin.BasePlugin;

/**
 * @author johnniang
 * @since 2.0.0
 */
@Component
public class AliOSSPlugin extends BasePlugin {
    private final SchemeManager schemeManager;

    public AliOSSPlugin(PluginWrapper wrapper) {
        super(wrapper);
        this.schemeManager = getApplicationContext().getBean(SchemeManager.class);
    }

    @Override
    public void start() {
    }

    @Override
    public void stop() {
    }
}
