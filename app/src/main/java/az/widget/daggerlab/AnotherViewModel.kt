package az.widget.daggerlab

import androidx.lifecycle.ViewModel
import az.widget.daggerlab.anotherRepo.IAnotherRepo
import javax.inject.Inject

class AnotherViewModel @Inject constructor(
    val repo: IAnotherRepo
): ViewModel() {
    init {
        repo.getFloat()
    }
}