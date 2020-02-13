package ie.wit.mymarathon.activities;

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import ie.wit.mymarathon.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var ed1= findViewById(R.id.email_login)as EditText;
        var ed2= findViewById(R.id.password_login)as EditText;

        //var tx1 = findViewById(R.id.password_edittext_register)//
        //var tx1 = findViewById(R.id.email_edittext_register) as TextView
        //tx1.setVisibility(View.GONE)
        var counter = 3


        loginBtn.setOnClickListener {

            val user_name = ed1.text.toString()
            val pass_word = ed2.text.toString()
            if(user_name == "admin" && pass_word =="admin") {
                Toast.makeText(getApplicationContext(),
                    "Redirecting...",Toast.LENGTH_SHORT).show();


                    startActivity(Intent(this, Mymarathon::class.java))

                }

            else{
                Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();

                //tx1.setVisibility(View.VISIBLE);
                //tx1.setBackgroundColor(100)
                counter--;
                //tx1.setText(Integer.toString(counter))

                if (counter == 0) {
                    loginBtn.setEnabled(false);
                }
            }
        }

    }
}
