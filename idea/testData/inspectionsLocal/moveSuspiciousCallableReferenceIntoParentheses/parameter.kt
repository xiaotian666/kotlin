// FIX: Move suspicious callable reference into parentheses '()'
// WITH_RUNTIME

fun foo() {
    listOf(1,2,3).map {<caret> bar -> bar::toString }
}