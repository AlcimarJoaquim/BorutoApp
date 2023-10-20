package br.com.alcimar.borutoapp.di

import br.com.alcimar.borutoapp.data.remote.BorutoApi
import br.com.alcimar.borutoapp.util.Constants.BASE_URL
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetWorkModule {

    @Provides
    @Singleton
    fun providesHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .readTimeout(15, TimeUnit.MINUTES)
            .connectTimeout(15, TimeUnit.MINUTES)
            .build()]
    }

    @Provides
    @Singleton
    fun provideRetrofitInstance(okHttpClient: OkHttpClient): Retrofit {
        val contentType = MediaType.get("application/json")
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(Json.asConverterFactory(contentType))
            .build()
    }

    @Provides
    @Singleton
    fun providesBorutoApi(retrofit: Retrofit): BorutoApi{
        return retrofit.create(BorutoApi::class.java)
    }
}