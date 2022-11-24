package az.widget.daggerlab

import androidx.lifecycle.ViewModel
import az.widget.daggerlab.externalRepo.ExternalRepo
import javax.inject.Inject

class ExternalViewModel @Inject constructor(
    repo: ExternalRepo
): ViewModel() {
    init {
        repo.makeInjection()
    }
}