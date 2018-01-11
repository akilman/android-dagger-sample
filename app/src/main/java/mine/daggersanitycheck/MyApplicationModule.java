package mine.daggersanitycheck;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Dagger-ism representing a object sub-graph
 */
@Module
public abstract class MyApplicationModule {
    @ContributesAndroidInjector
    abstract MainActivity contributeActivityInjector();
}
