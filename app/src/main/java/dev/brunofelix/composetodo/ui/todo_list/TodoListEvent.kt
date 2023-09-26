package dev.brunofelix.composetodo.ui.todo_list

import dev.brunofelix.composetodo.data.Todo

sealed class TodoListEvent {
    data class OnDeleteTodoClick(val todo: Todo): TodoListEvent()
    data class OnDoneChange(val todo: Todo, val isDone: Boolean): TodoListEvent()
    data class OnTodoClick(val todo: Todo): TodoListEvent()
    object OnAddTodoClick: TodoListEvent()
    object OnUndoDeleteClick: TodoListEvent()
}