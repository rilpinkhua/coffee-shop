package co.folto.kopigo.ui.main

import co.folto.kopigo.data.UserRepository
import com.squareup.otto.Bus
import dagger.Module
import dagger.Provides

/**
 * Created by Daniel on 6/15/2017 for Kopigo project.
 */
@Module
class MainModule(val view: MainContract.View) {

    @Provides
    fun providePresenter(userRepository: UserRepository, bus: Bus): MainContract.Presenter
            = MainPresenter(userRepository, view)
}