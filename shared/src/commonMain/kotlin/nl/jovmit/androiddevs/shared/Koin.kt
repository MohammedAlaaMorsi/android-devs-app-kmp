package nl.jovmit.androiddevs.shared

import nl.jovmit.androiddevs.core.database.AppDatabase
import nl.jovmit.androiddevs.core.network.AuthService
import nl.jovmit.androiddevs.core.network.AuthServiceImp
import nl.jovmit.androiddevs.core.network.ktor.Ktor
import nl.jovmit.androiddevs.core.network.ktor.KtorClientProvider
import nl.jovmit.androiddevs.core.network.ktor.KtorClientProviderImp
import nl.jovmit.androiddevs.domain.auth.AuthRepository
import nl.jovmit.androiddevs.domain.auth.RemoteAuthRepository
import org.koin.core.context.startKoin
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.bind
import org.koin.dsl.module


fun initKoin(config: KoinAppDeclaration? = null) =
    startKoin {
        config?.invoke(this)
        modules(
            provideNetworkModule,
            provideDatabaseModule,
            provideAuthModule
        )
    }


val provideNetworkModule = module {
    singleOf(::Ktor)
    singleOf(::AuthServiceImp).bind(AuthService::class)
    singleOf(::KtorClientProviderImp).bind(KtorClientProvider::class)
}

val provideDatabaseModule = module {
    roomModule()
    single {
        get<AppDatabase>().userDao()
    }
}

val provideAuthModule = module {
    singleOf(::RemoteAuthRepository).bind(AuthRepository::class)
}

/*
val provideRepositoryModule = module {
    singleOf(::NoteRepositoryImpl).bind(NoteRepository::class)
}

val provideUseCaseModule = module {
    singleOf(::CreateNoteUseCase)
    singleOf(::GetAllNotesUseCase)
    singleOf(::DeleteNoteUseCase)
    singleOf(::UpdateNoteUseCase)
    singleOf(::GetNoteUseCase)
}

val provideViewModelModule = module {
    viewModelOf(::CreateNoteViewModel)
    viewModelOf(::HomeViewModel)
}*/
