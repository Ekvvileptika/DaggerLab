package az.widget.daggerlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import az.widget.daggerlab.repository.IRepository
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var repo: IRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        appComponent.inject(this)

        repo.getSomeFunction()
    }
}