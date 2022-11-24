package az.widget.daggerlab.subRepo

import javax.inject.Inject

class SubRepository @Inject constructor(): ISubRepository {
    override fun getItem(): Int {
        return 1
    }
}