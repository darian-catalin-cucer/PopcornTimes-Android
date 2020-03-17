package `in`.aayushgoyal.popcorntimes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.TextView

class AboutAppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_app)

        val tvMadeWithLove = findViewById<TextView>(R.id.tv_text_made_with_love_activity_about_app)
        val textMadeWithLove = "<font color=#EDE2C4>Made with </font>" +
                "<font color=#FF0000>\u2665 </font>" +
                "<font color=#EDE2C4> in <b>India</b>.</font>"
        tvMadeWithLove.text = Html.fromHtml(textMadeWithLove)
    }

}
