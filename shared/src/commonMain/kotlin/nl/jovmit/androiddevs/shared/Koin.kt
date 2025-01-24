package nl.jovmit.androiddevs.shared

import nl.jovmit.androiddevs.core.network.AuthService
import nl.jovmit.androiddevs.core.network.AuthServiceImp
import nl.jovmit.androiddevs.core.network.ktor.Ktor
import nl.jovmit.androiddevs.core.network.ktor.KtorClientProvider
import nl.jovmit.androiddevs.core.network.ktor.KtorClientProviderImp
import org.koin.core.context.startKoin
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.bind
import org.koin.dsl.module


fun initKoin(config: KoinAppDeclaration? = null) =
    startKoin {
        config?.invoke(this)
        modules(
            provideNetworkModule
        )
    }


val provideNetworkModule = module {
    singleOf(::Ktor)
    singleOf(::AuthServiceImp).bind(AuthService::class)
    singleOf(::KtorClientProviderImp).bind(KtorClientProvider::class)
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
