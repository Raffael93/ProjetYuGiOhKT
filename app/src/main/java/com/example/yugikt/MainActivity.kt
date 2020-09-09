package com.example.yugikt
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity



import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.login.*
import kotlinx.android.synthetic.main.register.*


class MainActivity : AppCompatActivity() {

    lateinit var handler:DataBase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        handler = DataBase(this)

        showHome()
        buttonRegister.setOnClickListener {
            showRegistration()
        }

        ButtonLogin.setOnClickListener {
            showLogIN()
        }

        register.setOnClickListener {
            handler.insertData(name.text.toString(),email.text.toString(),password_register.text.toString() )
            showHome()
        }

        login.setOnClickListener {
           if( handler.userPresent(email_login.text.toString(),password_login.text.toString() )){

               Toast.makeText(this,"Login success", Toast.LENGTH_SHORT).show()
               startActivity( Intent(this,RecyclerView::class.java))
           }
            else{
               Toast.makeText(this,"Login failed", Toast.LENGTH_SHORT).show()

           }

        }


    }









    private fun showRegistration(){
        registration_layout.visibility= View.VISIBLE
        login_layout.visibility=View.GONE
        home_ll.visibility=View.GONE
    }

    private fun showLogIN(){
        registration_layout.visibility= View.GONE
        login_layout.visibility=View.VISIBLE
        home_ll.visibility=View.GONE
    }
    private fun showHome(){
        registration_layout.visibility= View.GONE
        login_layout.visibility=View.GONE
        home_ll.visibility=View.VISIBLE
    }

}