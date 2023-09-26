package dev.brunofelix.composetodo.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.brunofelix.composetodo.data.TodoDatabase
import dev.brunofelix.composetodo.data.TodoRepository
import dev.brunofelix.composetodo.data.TodoRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideTodoDatabase(app: Application) =
        Room.databaseBuilder(
            app,
            TodoDatabase::class.java,
            "todo_db"
        ).build()

    @Provides
    @Singleton
    fun provideTodoRepository(db: TodoDatabase): TodoRepository = TodoRepositoryImpl(db.dao)
}