package io.github.seoj17.aboutme

class MainContract {
    interface View {
        fun showInputName()

        fun hideInputName()

        fun showName(name: String)

        fun hideName()

    }

    interface Presenter {
        fun start()

        fun inputName()

        fun doneInputName(name: String)
    }
}