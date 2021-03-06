package com.smartcity.provider.di.auth

import androidx.fragment.app.FragmentFactory
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.RequestManager
import com.smartcity.provider.di.main.MainScope
import com.smartcity.provider.fragments.auth.AuthFragmentFactory

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
object AuthFragmentsModule {

    @JvmStatic
    @AuthScope
    @Provides
    @Named("AuthFragmentFactory")
    fun provideFragmentFactory(
        viewModelFactory: ViewModelProvider.Factory,
        requestManager: RequestManager
    ): FragmentFactory {
        return AuthFragmentFactory(
            viewModelFactory,
            requestManager
        )
    }
}