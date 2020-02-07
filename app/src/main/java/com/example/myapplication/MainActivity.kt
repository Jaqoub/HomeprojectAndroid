package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bundle: Bundle? = intent.extras
        if(bundle?.getParcelable<User?>("user")!=null){

            val user: User? =(bundle.getParcelable<User?>("user"))
            user?.let{viewModel.saveUser(it)}
        }

        viewModel.viewState.observeNonNull(this){state->
            handleErrors(state)
        }
    }
}
