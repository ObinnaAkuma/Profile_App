package o.akuma.profile_application

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import o.akuma.profile_application.databinding.ActivityWebViewBinding

class WebViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWebViewBinding
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.wvView.settings.javaScriptEnabled = true
        binding.wvView.settings.setSupportZoom(true)
        binding.wvView.webViewClient = WebViewClient()
        binding.wvView.loadUrl("https://github.com/ObinnaAkuma")
    }
}