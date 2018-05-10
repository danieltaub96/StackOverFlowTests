package application;

import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;

public class CustomRunner extends BlockJUnit4ClassRunner {
    public CustomRunner(Class<?> clazz) throws InitializationError {
        super(clazz);
    }

    @Override
    protected boolean isIgnored(FrameworkMethod child) {
        return shouldIgnore() || super.isIgnored(child);
    }

    /**
     *
     * @return if your test should be ignored or not
     */
    private boolean shouldIgnore() {
        // Some check if your docker is up

        return true;
    }
}