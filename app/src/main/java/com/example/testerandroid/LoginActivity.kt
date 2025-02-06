package com.example.testerandroid

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {

    private lateinit var usernameEditText: TextInputEditText
    private lateinit var passwordEditText: TextInputEditText
    private lateinit var loginButton: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Initialize UI elements using ViewBinding
        usernameEditText = findViewById(R.id.usernameEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        loginButton = findViewById(R.id.loginButton)

        // Handle login button click
        loginButton.setOnClickListener {
            loginUser()
        }

            }

    private fun loginUser() {
        val username = usernameEditText.text.toString().trim()
        val password = passwordEditText.text.toString().trim()

        // Check if username and password are empty
        if (TextUtils.isEmpty(username)) {
            usernameEditText.error = "Enter your username"
            return
        }

        if (TextUtils.isEmpty(password)) {
            passwordEditText.error = "Enter your password"
            return
        }

        // Simple login validation (use your own authentication logic here)
        if (username == "admin" && password == "123456") {
            Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show()

            // Redirect to main activity
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)
            finish()  // Finish LoginActivity to remove it from back stack
        } else {
            Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
        }
    }
}



//package com.example.testerandroid
//import android.os.Bundle
//import android.widget.Button
//import android.widget.EditText
//import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
//
//class LoginActivity : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_login)
//
//        // العثور على العناصر في الواجهة
//        val emailEditText: EditText = findViewById(R.id.emailEditText)
//        val passwordEditText: EditText = findViewById(R.id.passwordEditText)
//        val loginButton: Button = findViewById(R.id.loginButton)
//
//        // تعيين حدث النقر على زر تسجيل الدخول
//        loginButton.setOnClickListener {
//            val email = emailEditText.text.toString()
//            val password = passwordEditText.text.toString()
//
//            // التحقق من صحة البيانات (يمكنك إضافة المزيد من الشروط هنا)
//            if (email.isNotEmpty() && password.isNotEmpty()) {
//                // هنا يمكنك إضافة الكود للتحقق من صحة البيانات مع الخادم
//                Toast.makeText(this, "تم تسجيل الدخول بنجاح!", Toast.LENGTH_SHORT).show()
//            } else {
//                Toast.makeText(this, "الرجاء إدخال البريد الإلكتروني وكلمة المرور", Toast.LENGTH_SHORT).show()
//            }
//        }
//    }
//}

//class LoginActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_login)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
//    }
//}