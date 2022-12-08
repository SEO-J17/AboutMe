package io.github.seoj17.aboutme

class MainPresenter(
    private val view: MainContract.View
) : MainContract.Presenter {

    override fun start() {
        view.showTitleName()
        view.showInputName()
        view.hideName()
    }

    override fun inputName() {

    }

    override fun doneInputName(name: String) {
        view.hideInputName()
        view.showName(
            name.ifBlank { "nobody" }
        )
    }
}