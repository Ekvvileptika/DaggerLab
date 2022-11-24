package az.widget.daggerlab

import android.content.Context
import androidx.lifecycle.ViewModel
import az.widget.daggerlab.subRepo.ISubRepository
import javax.inject.Inject

class MainSubViewModel: ViewModel() {

    @Inject
    lateinit var element: ISubRepository

    fun cntxt(context: Context) {
        context.appComponent.injectSubComponent().build().inject(this)

        element.getItem()
    }
}