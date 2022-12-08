package io.github.seoj17.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import io.github.seoj17.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainContract.View {
    private lateinit var binding: ActivityMainBinding
    private lateinit var presenter: MainContract.Presenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        presenter = MainPresenter(this)
    }

    override fun onResume() {
        super.onResume()
        presenter.start()
    }

    override fun showTitleName() {
        binding.myName = Myname(" SEO ")
    }

    override fun showInputName() {
        with(binding) {
            nickName.visibility = View.VISIBLE
            submitNickName.setOnClickListener {
                presenter.doneInputName("${nickName.text}")
            }
        }
    }

    override fun hideInputName() {
        binding.nickName.visibility = View.GONE
    }

    override fun showName(name: String) {
        with(binding.realName) {
            visibility = View.VISIBLE
            text = name
        }
    }

    override fun hideName() {
        binding.realName.visibility = View.GONE
    }

}