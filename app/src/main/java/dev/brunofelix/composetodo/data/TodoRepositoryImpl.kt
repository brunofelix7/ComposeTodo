package dev.brunofelix.composetodo.data

import javax.inject.Inject

class TodoRepositoryImpl @Inject constructor(
    private val dao: TodoDao
) : TodoRepository {
    override suspend fun insert(todo: Todo) = dao.insert(todo)
    override suspend fun delete(todo: Todo) = dao.delete(todo)
    override suspend fun getById(id: Int) = dao.getById(id)
    override fun getAll() = dao.getAll()
}